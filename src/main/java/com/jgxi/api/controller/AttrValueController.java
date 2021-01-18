package com.jgxi.api.controller;

import com.jgxi.api.entity.po.AttrValue;
import com.jgxi.api.entity.vo.ReponseData;
import com.jgxi.api.service.AttrValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/attrvalue/")
public class AttrValueController {
    @Autowired
    private AttrValueService attrValueService;


    /*
    * url
    * 方式
    * 参数
    * 返回值
    * */
    @PostMapping("addData")
    public ReponseData addData(AttrValue attrValue){
        attrValueService.add(attrValue);
        return ReponseData.success("处理成功");
    }
}
