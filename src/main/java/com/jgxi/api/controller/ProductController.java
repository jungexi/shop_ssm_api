package com.jgxi.api.controller;

import com.jgxi.api.entity.po.Product;
import com.jgxi.api.entity.vo.ReponseData;
import com.jgxi.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/product/")
public class ProductController {
    @Autowired
    private ProductService productService;

        /*
          attr '[{"system:ios"},{mdoe:"厂商"},{}]'
          sku [{size:l,"coolr":"","pricess":"","storcks":""}|]
         */
    @PostMapping("add")
    public ReponseData add(Product product,String attr,String sku){
        productService.add(product,attr,sku);
        return ReponseData.success("");
    }
}
