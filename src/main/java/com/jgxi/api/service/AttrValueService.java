package com.jgxi.api.service;

import com.jgxi.api.entity.po.AttrValue;

import java.util.List;

public interface AttrValueService {
    public void add(AttrValue av);
    public List<AttrValue> queryDataByAid(Integer aid);
}
