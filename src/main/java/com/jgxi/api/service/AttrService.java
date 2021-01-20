package com.jgxi.api.service;

import com.jgxi.api.entity.po.Attr;
import com.jgxi.api.entity.vo.AttrParams;

import java.util.List;
import java.util.Map;

public interface AttrService {
    public void add(Attr attr);

    public Map queryDataByParam(AttrParams params);

    public List<Attr> queryDataByTypeId(Integer tid);
}
