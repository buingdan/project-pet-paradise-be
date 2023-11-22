package com.example.projectpetparadisebe.service.impl;

import com.example.projectpetparadisebe.entities.Address;
import com.example.projectpetparadisebe.payload.address.AddressDTO;
import com.example.projectpetparadisebe.repository.AddressRepository;
import com.example.projectpetparadisebe.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<AddressDTO> findAll() {
        return addressRepository.findAlls();
    }

    @Override
    public Address save(Address Address) {
        return addressRepository.save(Address);
    }

    @Override
    public void deleteById(Integer id) {
        addressRepository.deleteById(id);
    }

    @Override
    public Optional<Address> findById(Integer id) {
        return addressRepository.findById(id);
    }

    @Override
    public List<Address> findByAccountId(Integer accountId) {
        return addressRepository.findByAccountId(accountId);
    }
}
