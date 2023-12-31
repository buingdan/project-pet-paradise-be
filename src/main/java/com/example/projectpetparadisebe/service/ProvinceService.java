package com.example.projectpetparadisebe.service;

import com.example.projectpetparadisebe.entities.Province;

import java.util.List;
import java.util.Optional;

public interface ProvinceService {
    List<Province> findAll();

    Province save(Province province);

    void deleteById(Integer id);

    Optional<Province> findById(Integer id);
}
