package com.example.projectpetparadisebe.service;

import com.example.projectpetparadisebe.entities.Material;

import java.util.List;
import java.util.Optional;

public interface MaterialService {
    List<Material> findAll();

    Material save(Material Tag);

    void deleteById(Integer id);

    Optional<Material> findById(Integer id);


}
