package com.alex.guide.service;

import com.alex.guide.model.Guide;
import com.alex.guide.repository.GuideRepository;

import java.util.List;

public class GuideService {

    private final GuideRepository repository;

    public GuideService(GuideRepository repository) {
        this.repository = repository;
    }

    public Guide save(Guide guide) {
        repository.save(guide);
        return guide;

    }

    public List<Guide> findAll() {
        return repository.findAll();
    }



}
