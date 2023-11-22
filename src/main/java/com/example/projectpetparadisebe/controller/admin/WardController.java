package com.example.projectpetparadisebe.controller.admin;

import com.example.projectpetparadisebe.entities.Ward;
import com.example.projectpetparadisebe.exception.HandleExceptionDemo;
import com.example.projectpetparadisebe.payload.response.IGenericResponse;
import com.example.projectpetparadisebe.service.WardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(value = "*", maxAge = 3600)
@RequestMapping("admin/ward")
public class WardController {
    @Autowired
    WardService wardService;

    @GetMapping("create")
    public ResponseEntity<?> createWard(@RequestBody Ward ward) {
        try {
            return ResponseEntity.ok().body(new IGenericResponse<Ward>(wardService.save(ward), 200, ""));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 400, "Oops! Lại lỗi api rồi..."));
        }
    }

    @PutMapping("update")
    public ResponseEntity<?> updateEvent(@RequestBody Ward ward) {
        try {
            Optional<Ward> wardOptional = wardService.findById(ward.getId());
            if (wardOptional.isPresent()) {

                return ResponseEntity.ok().body(new IGenericResponse<Ward>(wardService.save(ward), 200, ""));
            } else {
                return ResponseEntity.badRequest().body(new HandleExceptionDemo(400, "Không tìm thấy Ward"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 400, "Oops! Lại lỗi api rồi..."));
        }
    }

    @DeleteMapping("delete")
    public ResponseEntity<?> deleteEvent(@RequestParam("ward_id") Integer id) {
        try {
            Optional<Ward> wardOptional = wardService.findById(id);
            if (wardOptional.isPresent()) {
                wardService.deleteById(id);
                return ResponseEntity.ok().body(new HandleExceptionDemo(200, ""));
            } else {
                return ResponseEntity.badRequest().body(new HandleExceptionDemo(400, "Không tìm thấy Ward"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new IGenericResponse<>("", 400, "Oops! Lại lỗi api rồi..."));
        }
    }
}
