package com.example.projectpetparadisebe.service.impl;

import com.example.projectpetparadisebe.entities.District;
import com.example.projectpetparadisebe.repository.DistrictRepository;
import com.example.projectpetparadisebe.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    DistrictRepository districtRepository;

    @Override
    public List<District> findAll() {
        return districtRepository.findAll();
    }

    @Override
    public District save(District district) {
        return districtRepository.save(district);
    }

    @Override
    public void deleteById(Integer id) {
        districtRepository.deleteById(id);
    }

    @Override
    public Optional<District> findById(Integer id) {
        return districtRepository.findById(id);
    }
}
