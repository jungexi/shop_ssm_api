package com.jgxi.api.dao;

import com.jgxi.api.entity.po.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
@Mapper
public interface ProductDao {
    @Insert("insert  into shop_product  (name,title,bandId,typeId,productdecs,price,imgPath,stocks,sortNum,createDate,updateDate,author,isDel)" +
            " value(#{name},#{title},#{bandId},#{typeId},#{productdecs},#{price},#{imgPath},#{stocks},#{sortNum},#{createDate},#{updateDate},#{author},#{isDel})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void add(Product product);
}
