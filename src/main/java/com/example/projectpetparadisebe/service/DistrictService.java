package com.example.projectpetparadisebe.service;

import com.example.projectpetparadisebe.entities.District;

import java.util.List;
import java.util.Optional;

public interface DistrictService {
    List<District> findAll();

    District save(District district);

    void deleteById(Integer id);

    Optional<District> findById(Integer id);
}
