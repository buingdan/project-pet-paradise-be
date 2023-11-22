package com.example.projectpetparadisebe.service.impl;


import com.example.projectpetparadisebe.entities.Color;
import com.example.projectpetparadisebe.repository.ColorRepository;
import com.example.projectpetparadisebe.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColorServiceImpl implements ColorService {
    @Autowired
    ColorRepository colorRepository;

    @Override
    public List<Color> findAll() {
        return colorRepository.findAll();
    }

    @Override
    public Color save(Color Color) {
        return colorRepository.save(Color);
    }

    @Override
    public void deleteById(Integer id) {
        colorRepository.deleteById(id);
    }

    @Override
    public Optional<Color> findById(Integer id) {
        return colorRepository.findById(id);
    }

    @Override
    public Optional<Color> findByDetailProductId(Integer detailProductId) {
        return colorRepository.findByDetailProductId(detailProductId);
    }
}
