package com.example.projectpetparadisebe.service.impl;

import com.example.projectpetparadisebe.entities.Tag;
import com.example.projectpetparadisebe.repository.TagRepository;
import com.example.projectpetparadisebe.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    TagRepository tagRepository;

    @Override
    public List<Tag> findAll() {
        return tagRepository.findAll();
    }

    @Override
    public Optional<Tag> findByTagName(String tagName) {
        return tagRepository.findByTagName(tagName);
    }

    @Override
    public Tag save(Tag Tag) {
        return tagRepository.save(Tag);
    }

    @Override
    public void deleteById(Integer id) {
        tagRepository.deleteById(id);
    }

    @Override
    public Optional<Tag> findById(Integer id) {
        return tagRepository.findById(id);
    }


}
