package com.jgxi.api.dao;

import com.jgxi.api.entity.po.AttrValue;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttrValueDao {
    @Insert("insert into shop_product_attr_value (value,valueCH,attrId,isDel) value(#{value},#{valueCH},#{attrId},#{isDel})")
    public void add(AttrValue av);
}
