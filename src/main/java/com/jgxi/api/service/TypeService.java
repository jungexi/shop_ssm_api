package com.jgxi.api.service;

import com.jgxi.api.entity.po.Type;

import java.util.List;

public interface TypeService {
    public List<Type> queryAllData();
    //新增后 返回主键
    public Integer insert(Type type);
}
