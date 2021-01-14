package com.jgxi.api.service.impl;

import com.jgxi.api.dao.TypeDao;
import com.jgxi.api.entity.po.Type;
import com.jgxi.api.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeDao typeDao;
    @Override
    public List<Type> queryAllData() {
        return typeDao.queryAllData();
    }
}
