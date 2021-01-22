package com.jgxi.api.dao;

import com.jgxi.api.entity.po.ProductAttrDatas;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductAttrDatasDao {
    @Insert("insert into shop_product_attrdatas (proId,attrData,storcks,price) " +
            "value(#{proId},#{attrData},#{storcks},#{price})")
    public void add(ProductAttrDatas pad);
    @Insert("<script>insert into shop_product_attrdatas (proId,attrData,storcks,price) " +
            "values <foreach collection='list' item='a' separator=','> ( #{a.proId},#{a.attrData},#{a.storcks},#{a.price} )  </foreach> </script>")
    public void adds(List<ProductAttrDatas> list);

}
