package com.jgxi.api.service.impl;

import com.jgxi.api.dao.AttrDao;
import com.jgxi.api.entity.po.Attr;
import com.jgxi.api.entity.vo.AttrParams;
import com.jgxi.api.entity.vo.AttrShow;
import com.jgxi.api.service.AttrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AttrServiceImpl implements AttrService {
    @Resource
    private AttrDao attrDao;


    @Override
    public void add(Attr attr) {
        //处理一个默认参数
        Date now=new Date();
        attr.setCreateDate(now);
        attr.setUpdateDate(now);
        attr.setAuthor("test");
        attrDao.add(attr);
    }

    @Override
    public Map queryDataByParam(AttrParams params) {
        Map rs=new HashMap();
        Long aLong = attrDao.queryDataCount(params);
        List<AttrShow> attrShow = attrDao.queryData(params);
        rs.put("data",attrShow);
        rs.put("count",aLong);
        return rs;
    }
}
