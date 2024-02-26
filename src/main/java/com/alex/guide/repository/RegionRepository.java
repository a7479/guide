package com.alex.guide.repository;

import com.alex.guide.model.Region;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RegionRepository {

    @Insert("INSERT INTO guide (name, abr) VALUES (#{name}, #{abr})")
    void save(Region region);

    @Select("SELECT * FROM guide")
    List<Region> findAll();

    @Update("UPDATE guide SET name = #{name}, abr = #{abr} WHERE id = #{id}")
    void update(Region guide);
    @Delete("DELETE FROM guide WHERE id = #{id}")
    void delete(Long guideId);

}
