package com.jgxi.api.service.impl;

import com.jgxi.api.dao.BandDao;
import com.jgxi.api.entity.po.Band;
import com.jgxi.api.service.BandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class BandServiceImpl implements BandService {
    @Resource
    private BandDao bandDao;
    @Override
    public List<Band> queryAllData() {
        return bandDao.queryAllData();
    }

    @Override
    public void add(Band band) {
        Date now=new Date();
        band.setCreateDate(now);
        band.setUpdateDate(now);
        band.setAuthor("test");
        bandDao.add(band);
    }
}
