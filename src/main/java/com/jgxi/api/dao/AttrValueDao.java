package com.jgxi.api.dao;

import com.jgxi.api.entity.po.AttrValue;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AttrValueDao {
    @Insert("insert into shop_product_attr_value (value,valueCH,attrId,isDel) value(#{value},#{valueCH},#{attrId},#{isDel})")
    public void add(AttrValue av);
    @Select("select * from shop_product_attr_value where attrId=#{a} ")
    public List<AttrValue> queryAllDataByAid(Integer aid);
}
