package com.example.projectpetparadisebe.controller.website;

import com.example.projectpetparadisebe.entities.DetailProduct;
import com.example.projectpetparadisebe.entities.Product;
import com.example.projectpetparadisebe.payload.response.DetailProductDto;
import com.example.projectpetparadisebe.payload.response.IGenericResponse;
import com.example.projectpetparadisebe.service.DetailProductService;
import com.example.projectpetparadisebe.service.ProductSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(value = "*", maxAge = 3600)
@RequestMapping("productDetail")
public class DetailProductWebsiteController {
    @Autowired
    DetailProductService detailProductService;
    @Autowired
    ProductSevice productSevice;

    @GetMapping("findByProductId")
    public ResponseEntity<?> findByProductId(@RequestParam("product_id") Integer productId) {
        try {
            Optional<Product> product = productSevice.findById(productId);
            if (product.isPresent()) {
                List<DetailProduct> detailProducts = detailProductService.findAllByProductId(productId);
                List<DetailProductDto> detailProductDtos = detailProducts.stream().map(e -> new DetailProductDto(e.getId(), e.getQuantity(), e.getPriceImport(),
                                e.getPriceExport(), e.getIsDelete(), e.getProductImage(), e.getProduct().getProductName(), e.getColor(), e.getSize())).
                        collect(Collectors.toList());
                return ResponseEntity.
                        ok().
                        body(new IGenericResponse<List<DetailProductDto>>(detailProductDtos, 200, "lấy mọi detail product của sản phẩm có id là id_product"));
            }
            return ResponseEntity.badRequest().body(new IGenericResponse(400, "Không tìm thấy product"));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 400, "Oops! Lại lỗi api rồi..."));
        }
    }
}
