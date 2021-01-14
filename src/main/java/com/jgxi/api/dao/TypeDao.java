package com.jgxi.api.dao;

import com.jgxi.api.entity.po.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TypeDao {
    @Select("select * from shop_product_type")
    public List<Type> queryAllData();

}
