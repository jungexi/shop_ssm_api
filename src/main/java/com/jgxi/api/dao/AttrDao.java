package com.jgxi.api.dao;

import com.jgxi.api.entity.po.Attr;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttrDao {
    @Insert("insert into shop_product_attr (name,nameCH,typeId,type,isSKU,isDel,createDate,updateDate,author)" +
            " value(#{name},#{nameCH},#{typeId},#{type},#{isSKU},#{isDel},#{createDate},#{updateDate},#{author})")
    public void add(Attr attr);

}
