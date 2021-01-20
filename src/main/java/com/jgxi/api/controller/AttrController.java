package com.jgxi.api.controller;

import com.jgxi.api.entity.po.Attr;
import com.jgxi.api.entity.vo.AttrParams;
import com.jgxi.api.entity.vo.ReponseData;
import com.jgxi.api.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    /*
        分页查询
        page  必传
        size  必传



     */
    @PostMapping("queryDataByParams")
    public ReponseData queryDataByParams(AttrParams params){
        /*  验证参数  */
        if(params.getPage()==null||params.getSize()==null){
            return  ReponseData.error(400,"参数不合法");
        }
        return ReponseData.success(attrService.queryDataByParam(params));
    }
    /*

     */
    @GetMapping("queeryDataByTypeId")
    public ReponseData queeryDataByTypeId(Integer typeId){
        return ReponseData.success(attrService.queryDataByTypeId(typeId));
    };
}
