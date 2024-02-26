package com.alex.guide.controller;

import com.alex.guide.model.Region;
import com.alex.guide.service.RegionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegionController {

private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @PostMapping
    public ResponseEntity <Region> createGuide(@RequestBody Region region) {
        Region createdGuide = regionService.save(region);
        return ResponseEntity.ok(createdGuide);
    }
    @GetMapping("/guide")
    public ResponseEntity <List<Region>> readGuide() {
        return ResponseEntity.ok(regionService.findAll());
    }
    @PutMapping
    public ResponseEntity<Region> updateGuide(@RequestBody Region region) {
        Region updatedGuide = regionService.update(region);
        return ResponseEntity.ok(updatedGuide);
    }
    @DeleteMapping("{regionId}")
    public ResponseEntity<Object> deleteGuide(@PathVariable Long regionId) {
        regionService.delete(regionId);
        return ResponseEntity.ok().build();
    }
}
