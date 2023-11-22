package com.example.projectpetparadisebe.service;

import com.example.projectpetparadisebe.entities.Color;

import java.util.List;
import java.util.Optional;

public interface ColorService {

    Optional<Color> findById(Integer id);

    void deleteById(Integer id);

    Color save(Color color);

    List<Color> findAll();

    Optional<Color> findByDetailProductId(Integer detailProductId);
}
