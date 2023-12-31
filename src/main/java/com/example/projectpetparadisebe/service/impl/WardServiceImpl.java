package com.example.projectpetparadisebe.service.impl;

import com.example.projectpetparadisebe.entities.Ward;
import com.example.projectpetparadisebe.repository.WardRepository;
import com.example.projectpetparadisebe.service.WardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WardServiceImpl implements WardService {
    @Autowired
    WardRepository wardRepository;

    @Override
    public List<Ward> findAll() {
        return wardRepository.findAll();
    }

    @Override
    public Ward save(Ward ward) {
        return wardRepository.save(ward);
    }

    @Override
    public void deleteById(Integer id) {
        wardRepository.deleteById(id);
    }

    @Override
    public Optional<Ward> findById(Integer id) {
        return wardRepository.findById(id);
    }
}
