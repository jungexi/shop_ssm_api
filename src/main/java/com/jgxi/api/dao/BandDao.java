package com.jgxi.api.dao;

import com.jgxi.api.entity.po.Band;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BandDao {
    public List<Band> queryAllData();
    @Insert("insert into shop_product_band (name,bandE,imgpath,bandDesc,ord,isdel,createDate,updateDate,author)" +
            "  value (#{name},#{bandE},#{imgpath},#{bandDesc},#{ord},#{isdel},#{createDate},#{updateDate},#{author})")
    public void add(Band band);
}
