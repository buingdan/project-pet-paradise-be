package com.example.projectpetparadisebe.service;

import com.example.projectpetparadisebe.entities.Address;
import com.example.projectpetparadisebe.payload.address.AddressDTO;

import java.util.List;
import java.util.Optional;

public interface AddressService {

    Optional<Address> findById(Integer id);

    void deleteById(Integer id);

    Address save(Address address);

    List<AddressDTO> findAll();

    List<Address> findByAccountId(Integer accountId);
}
