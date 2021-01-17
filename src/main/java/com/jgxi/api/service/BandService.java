package com.jgxi.api.service;

import com.jgxi.api.entity.po.Band;

import java.util.List;

public interface BandService {
    public List<Band> queryAllData();
    public void  add(Band band);
}
