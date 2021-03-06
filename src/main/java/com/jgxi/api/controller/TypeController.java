package com.jgxi.api.controller;

import com.jgxi.api.entity.po.Type;
import com.jgxi.api.entity.vo.ReponseData;
import com.jgxi.api.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/type/")
public class TypeController {
        @Autowired
        private TypeService typeService;
        /*
        * 1    查询所有的分类数据
                路径   http://ip:port/api/type/getData

                get请求

                参数

                返回值   {"code":200,"message":"提示",data:[{*}]}
        * */
        @GetMapping("getData")
        public ReponseData queryAllData(){
            return ReponseData.success(typeService.queryAllData());
        }


        /*
        * 3  新增分类

                路径   http://ip:port/api/type/add

                   post请求

                   参数    pid    name

                返回值    {code:"",message:"",data:新增的id}

        *
        *
        * */
        @PostMapping("add")
        public ReponseData insert(Type type){
                return ReponseData.success(typeService.insert(type));
        };

}
