package com.example.projectpetparadisebe.controller.website;

import com.example.projectpetparadisebe.entities.Account;
import com.example.projectpetparadisebe.entities.Favorite;
import com.example.projectpetparadisebe.entities.FavoriteId;
import com.example.projectpetparadisebe.entities.Product;
import com.example.projectpetparadisebe.exception.HandleExceptionDemo;
import com.example.projectpetparadisebe.payload.productWebsiteDTO.ProductHandleWebsite;
import com.example.projectpetparadisebe.payload.response.IGenericResponse;
import com.example.projectpetparadisebe.service.AccountService;
import com.example.projectpetparadisebe.service.FavoriteService;
import com.example.projectpetparadisebe.service.ProductSevice;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(value = "*", maxAge = 3600)
@RequestMapping("favorite")
public class FavoriteWebsiteController {
    @Autowired
    FavoriteService favoriteService;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    ProductSevice productSevice;
    @Autowired
    AccountService accountService;

    @GetMapping("findProductFavoriteByAccountId")
    public ResponseEntity<?> findProductFavoriteByAccountId(@RequestParam("account_id") Integer accountId) {
        try {
            Optional<Account> account = accountService.findById(accountId);
            if (account.isPresent()) {
//            ProductDto productDto = modelMapper.map(, ProductDto.class);
                return ResponseEntity.ok().body(new IGenericResponse(favoriteService.findProductFavoriteByAccountId(accountId), 200, ""));
            }
            return ResponseEntity.badRequest().body(new HandleExceptionDemo(400, "Không tìm thấy Account"));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 400, "Oops! Lại lỗi api rồi..."));
        }
    }

    @GetMapping("findTop10FavoriteProduct")
    public ResponseEntity<?> findTop10FavoriteProduct() {
        try {
            List<Integer> list = favoriteService.findTop10FavoriteProduct();
            List<ProductHandleWebsite> productHandleWebsites = list.stream().map(e -> favoriteService.findProductById(e)).collect(Collectors.toList());
            return ResponseEntity.ok().body(new IGenericResponse<>(productHandleWebsites, 200, ""));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 400, "Oops! Lại lỗi api rồi..."));
        }
    }

    @PostMapping("create")
    public ResponseEntity<?> createFavorite(@RequestParam("product_id") Integer productId, @RequestParam("account_id") Integer accountId) {
        try {
            Optional<Favorite> favorite = favoriteService.findByAccountIdAndProductId(accountId, productId);
            Optional<Account> accountOptional = accountService.findById(accountId);
            Optional<Product> productOptional = productSevice.findById(productId);
            if (productOptional.isPresent() && accountOptional.isPresent()) {
                if (favorite.isPresent()) {
                    favoriteService.deleteByIdAccountAndProduct(accountId, productId);
                    return ResponseEntity.ok().body(new IGenericResponse<>("", 200, "xóa thành công"));

                } else {
                    FavoriteId favoriteId = new FavoriteId(accountId, productId);
                    Favorite fa = favoriteService.save(new Favorite(favoriteId,
                            LocalDateTime.now(), false, accountOptional.get(), false, productOptional.get()
                    ));
                    return ResponseEntity.ok().body(new IGenericResponse<Favorite>(fa, 200, "Thêm thành công"));

                }
            }
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 200, ""));


        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 400, "Oops! Lại lỗi api rồi..."));
        }
    }


}
