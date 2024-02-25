package com.alex.guide.repository;

import com.alex.guide.model.Guide;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GuideRepository {

    void save(Guide guide);

    List<Guide> findAll();
}
