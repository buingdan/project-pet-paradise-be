package com.example.projectpetparadisebe.service;

import com.example.projectpetparadisebe.entities.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    Optional<Category> findById(Integer id);

    void deleteById(Integer id);

    Category save(Category category);

    List<Category> findAll();

    List<Category> findAllCategoryParentId();

    List<Category> findByCategoryParentId(int id);
}
