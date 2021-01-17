package com.jgxi.api.service.impl;

import com.jgxi.api.dao.AttrDao;
import com.jgxi.api.entity.po.Attr;
import com.jgxi.api.service.AttrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

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
}
