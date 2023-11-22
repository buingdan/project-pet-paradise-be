package com.example.projectpetparadisebe.controller.admin;

import com.example.projectpetparadisebe.entities.Size;
import com.example.projectpetparadisebe.exception.HandleExceptionDemo;
import com.example.projectpetparadisebe.payload.response.IGenericResponse;
import com.example.projectpetparadisebe.payload.size.ListSizeIdDTO;
import com.example.projectpetparadisebe.payload.size.SizeDTO;
import com.example.projectpetparadisebe.payload.size.SizeUpdate;
import com.example.projectpetparadisebe.repository.DetailProductRepository;
import com.example.projectpetparadisebe.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(value = "*", maxAge = 3600)
@RequestMapping("admin/size")
public class SizeController {
    @Autowired
    SizeRepository sizeService;
    @Autowired
    DetailProductRepository detailProductRepository;

    @PostMapping("create")
    public ResponseEntity<?> createSize(@RequestBody SizeDTO sizeDTO) {
        try {
            Size size = new Size();
            size.setSizeName(sizeDTO.getSizeName());
            size.setCreateDate(LocalDateTime.now());
            size.setIsActive(true);
            size.setIsDeleted(false);
            return ResponseEntity.ok().body(new IGenericResponse<Size>(sizeService.save(size), 200, "success"));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new HandleExceptionDemo(500, "can't duplicate name"));
        }
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody SizeUpdate sizeUpdate) {
        try {
            Optional<Size> size1 = sizeService.findById(sizeUpdate.getId());
            if (size1.isPresent()) {
                size1.get().setSizeName(sizeUpdate.getSizeName());
                size1.get().setIsActive(sizeUpdate.getIsActive());
                size1.get().setIsDeleted(sizeUpdate.getIsDeleted());
                return ResponseEntity.ok().body(new IGenericResponse<Size>(sizeService.save(size1.get()), 200, "success"));
            }
            return ResponseEntity.badRequest().body(new HandleExceptionDemo(400, "Không tìm thấy"));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 400, "Oops! Lại lỗi api rồi..."));
        }
    }

    @DeleteMapping("delete")
    public ResponseEntity<?> delete(@RequestParam("size_id") Integer sizeId) {
        try {
            Optional<Size> size1 = sizeService.findById(sizeId);
            if (size1.isPresent()) {
                sizeService.deleteById(sizeId);
                return ResponseEntity.ok().body(new HandleExceptionDemo(200, "success"));
            }
            return ResponseEntity.badRequest().body(new HandleExceptionDemo(400, "Không tìm thấy"));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 400, "Oops! Lại lỗi api rồi..."));
        }
    }

    @GetMapping("findAll")
    public ResponseEntity<?> findAll(@RequestParam(value = "name", required = false) String name) {
        try {
            if (name == null) {
                return ResponseEntity.ok().body(new IGenericResponse<>(sizeService.findAll(), 200, ""));

            }
            return ResponseEntity.ok().body(new IGenericResponse<>(sizeService.findAll(name), 200, ""));

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 400, "Oops! Lại lỗi api rồi..."));
        }
    }

    @DeleteMapping("deleteByListId")
    public ResponseEntity<?> deleteArrayTagId(@RequestBody ListSizeIdDTO listSizeIdDTO) {
        try {
            List<Integer> list = listSizeIdDTO.getListSizeId();

            System.out.println(list.size());
            if (list.size() > 0) {
                for (Integer x : list
                ) {
                    Optional<Size> sizeOptional = sizeService.findById(x);

                    if (sizeOptional.isPresent()) {

                        sizeService.updateProductsDeleted(x);
                    }
                }
                return ResponseEntity.ok().body(new IGenericResponse<>("", 200, ""));
            }
            return ResponseEntity.badRequest().body(new HandleExceptionDemo(400, "Không tìm thấy "));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 400, "Oops! Lại lỗi api rồi..."));
        }
    }
}
