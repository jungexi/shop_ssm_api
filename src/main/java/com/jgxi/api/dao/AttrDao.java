package com.jgxi.api.dao;

import com.jgxi.api.entity.po.Attr;
import com.jgxi.api.entity.vo.AttrParams;
import com.jgxi.api.entity.vo.AttrShow;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AttrDao {
    @Insert("insert into shop_product_attr (name,nameCH,typeId,type,isSKU,isDel,createDate,updateDate,author)" +
            " value(#{name},#{nameCH},#{typeId},#{type},#{isSKU},#{isDel},#{createDate},#{updateDate},#{author})")
    public void add(Attr attr);
    /* 动态sql  建议在 xml */
    public List<AttrShow> queryData(AttrParams params);
    public Long queryDataCount(AttrParams params);
    @Select("select * from shop_product_attr where typeId=#{tid} and isDel=0")
    public List<Attr> queryDataByTypeId(Integer tid);

}
