package com.jgxi.api.service.impl;

import com.jgxi.api.dao.BandDao;
import com.jgxi.api.entity.po.Band;
import com.jgxi.api.entity.vo.PageParams;
import com.jgxi.api.service.BandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BandServiceImpl implements BandService {
    @Resource
    private BandDao bandDao;
    @Override
    public Map queryAllData(PageParams pageParams) {
        Map rs=new HashMap();
        Long aLong = bandDao.queryTotalCount();
        List<Band> bands = bandDao.queryAllData(pageParams);
        rs.put("count",aLong);
        rs.put("data",bands);
        return rs;
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
