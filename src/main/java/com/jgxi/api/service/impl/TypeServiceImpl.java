package com.jgxi.api.service.impl;

import com.jgxi.api.dao.TypeDao;
import com.jgxi.api.entity.po.Type;
import com.jgxi.api.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeDao typeDao;
    @Override
    public List<Type> queryAllData() {
        return typeDao.queryAllData();
    }

    @Override
    public Integer insert(Type type) {
        //获取系统当前时间
        Date now=new Date();
        //处理一些默认参数
        type.setCreateDate(now);
        type.setAuthor("test");
        type.setUpdateDate(now);
        typeDao.insert(type);
        return type.getId();
    }
}
