package com.example.projectpetparadisebe.controller.website;

import com.example.projectpetparadisebe.payload.response.IGenericResponse;
import com.example.projectpetparadisebe.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*", maxAge = 3600)
@RequestMapping("/district")
public class DistrictWebsiteController {
    @Autowired
    DistrictRepository districtRepository;

    @GetMapping("findAll")
    public ResponseEntity<?> findAll() {
        try {
            return ResponseEntity.ok().body(new IGenericResponse<>(districtRepository.findAll(), 200, ""));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 400, "Oops! Lại lỗi api rồi..."));
        }
    }

    @GetMapping("findByProviceId")
    public ResponseEntity<?> findByProviceId(@RequestParam("province_id") Integer provinceId) {
        try {
            return ResponseEntity.ok().body(new IGenericResponse<>(districtRepository.findByProvineId(provinceId), 200, ""));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 400, "Oops! Lại lỗi api rồi..."));
        }
    }
}
