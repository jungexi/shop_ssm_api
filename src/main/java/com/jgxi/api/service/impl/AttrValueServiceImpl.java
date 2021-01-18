package com.jgxi.api.service.impl;

import com.jgxi.api.dao.AttrDao;
import com.jgxi.api.dao.AttrValueDao;
import com.jgxi.api.entity.po.AttrValue;
import com.jgxi.api.service.AttrValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AttrValueServiceImpl implements AttrValueService {
    @Resource
    private AttrValueDao attrValueDao;
    @Override
    public void add(AttrValue av) {
        attrValueDao.add(av);
    }
}
