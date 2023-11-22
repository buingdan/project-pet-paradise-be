package com.example.projectpetparadisebe.service;

import com.example.projectpetparadisebe.entities.Ward;

import java.util.List;
import java.util.Optional;

public interface WardService {
    List<Ward> findAll();

    Ward save(Ward ward);

    void deleteById(Integer id);

    Optional<Ward> findById(Integer id);
}
