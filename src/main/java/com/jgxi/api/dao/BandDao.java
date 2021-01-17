package com.jgxi.api.dao;

import com.jgxi.api.entity.po.Band;
import com.jgxi.api.entity.vo.PageParams;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BandDao {
    @Select("select * from shop_product_band limit ${(page - 1) * size},#{size}")
    public List<Band> queryAllData(PageParams pageParams);
    @Select("select count(*) from shop_product_band ")
    public Long queryTotalCount();
    @Insert("insert into shop_product_band (name,bandE,imgpath,bandDesc,ord,isdel,createDate,updateDate,author)" +
            "  value (#{name},#{bandE},#{imgpath},#{bandDesc},#{ord},#{isdel},#{createDate},#{updateDate},#{author})")
    public void add(Band band);
}
