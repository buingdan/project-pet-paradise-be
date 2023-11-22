package com.example.projectpetparadisebe.service;

import com.example.projectpetparadisebe.entities.Size;

import java.util.List;
import java.util.Optional;

public interface SizeService {

    Optional<Size> findById(Integer id);

    void deleteById(Integer id);

    Size save(Size size);

    List<Size> findAll();

    Optional<Size> findByDetailProductId(Integer detailProductId);
}
