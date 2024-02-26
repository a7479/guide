package com.alex.guide.service;

import com.alex.guide.model.Region;
import com.alex.guide.repository.RegionRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class RegionService {

    private final RegionRepository repository;

    public RegionService(RegionRepository repository) {
        this.repository = repository;
    }

    @CachePut(value = "regions", key = "#region.name")
    public Region save(Region region) {
        repository.save(region);
        return region;
    }

    @Cacheable("regions")
    public List<Region> findAll() {
        return Collections.unmodifiableList(repository.findAll());
    }

    @CachePut(value = "regions")
    public Region update(Region region) {
        repository.update(region);
        return region;
    }

    @CacheEvict(value = "regions", allEntries = true)
    public void delete(Long regionId) {
        repository.delete(regionId);

    }


}
