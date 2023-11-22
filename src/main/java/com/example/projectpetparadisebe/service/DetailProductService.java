package com.example.projectpetparadisebe.service;

import com.example.projectpetparadisebe.entities.DetailProduct;

import java.util.List;
import java.util.Optional;

public interface DetailProductService {

    Optional<DetailProduct> findById(Integer id);

    void deleteById(Integer id);

    DetailProduct save(DetailProduct detailProduct);

    List<DetailProduct> findAll();

    List<DetailProduct> findAllByProductId(Integer idProduct);

    void deleteByProductId(Integer productId);
}
