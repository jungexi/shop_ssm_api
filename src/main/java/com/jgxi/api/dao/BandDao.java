package com.jgxi.api.dao;

import com.jgxi.api.entity.po.Band;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BandDao {
    public List<Band> queryAllData();
}
