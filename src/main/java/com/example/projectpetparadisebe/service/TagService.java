package com.example.projectpetparadisebe.service;

import com.example.projectpetparadisebe.entities.Tag;

import java.util.List;
import java.util.Optional;

public interface TagService {

    Optional<Tag> findById(Integer id);

    void deleteById(Integer id);

    Tag save(Tag tag);

    List<Tag> findAll();

    Optional<Tag> findByTagName(String tagName);


}
