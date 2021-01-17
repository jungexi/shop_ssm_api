package com.jgxi.api.service;

import com.jgxi.api.entity.po.Band;
import com.jgxi.api.entity.vo.PageParams;

import java.util.List;
import java.util.Map;

public interface BandService {
    public Map queryAllData(PageParams pageParams);
    public void  add(Band band);
}
