package com.jgxi.api.dao;

import com.jgxi.api.entity.po.Type;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TypeDao {
    @Select("select * from shop_product_type")
    public List<Type> queryAllData();
    @Insert("insert into shop_product_type (name,pid,createDate,updateDate,isDel,author) " +
            "value(#{name},#{pid},#{createDate},#{updateDate},#{isDel},#{author})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public void insert(Type type);

}
