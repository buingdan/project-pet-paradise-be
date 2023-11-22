package com.example.projectpetparadisebe.service.impl;

import com.example.projectpetparadisebe.entities.Province;
import com.example.projectpetparadisebe.repository.ProvinceRepository;
import com.example.projectpetparadisebe.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    ProvinceRepository provinceRepository;

    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province save(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public void deleteById(Integer id) {
        provinceRepository.deleteById(id);
    }

    @Override
    public Optional<Province> findById(Integer id) {
        return provinceRepository.findById(id);
    }
}
