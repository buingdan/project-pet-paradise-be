package com.example.projectpetparadisebe.service.impl;

import com.example.projectpetparadisebe.entities.Material;
import com.example.projectpetparadisebe.repository.MaterialRepository;
import com.example.projectpetparadisebe.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    MaterialRepository materialRepository;

    @Override
    public List<Material> findAll() {
        return materialRepository.findAll();
    }

    @Override
    public Material save(Material Tag) {
        return materialRepository.save(Tag);
    }

    @Override
    public void deleteById(Integer id) {
        materialRepository.deleteById(id);
    }

    @Override
    public Optional<Material> findById(Integer id) {
        return materialRepository.findById(id);
    }


}
