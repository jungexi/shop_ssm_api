package com.jgxi.api.controller;

import com.jgxi.api.entity.po.Attr;
import com.jgxi.api.entity.vo.ReponseData;
import com.jgxi.api.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/attr/")
public class AttrController {

    @Autowired
    private AttrService attrService;
    @PostMapping("add")
    public ReponseData add(Attr attr){
        attrService.add(attr);
        return ReponseData.success("");
    }
}
