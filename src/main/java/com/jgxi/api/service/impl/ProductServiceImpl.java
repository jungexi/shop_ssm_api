package com.jgxi.api.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jgxi.api.dao.ProductAttrDatasDao;
import com.jgxi.api.dao.ProductDao;
import com.jgxi.api.entity.po.Product;
import com.jgxi.api.entity.po.ProductAttrDatas;
import com.jgxi.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService {
    @Resource
    private ProductDao productDao;

    @Resource
    private ProductAttrDatasDao productAttrDatasDao;

    @Override
    @Transactional  //加上事务   什么是事务
    public void add(Product product,String attr,String sku) {
        //返回主键
        productDao.add(product);
        // 声明属性数据的对象
        List<ProductAttrDatas> adList=new ArrayList<>();
        //批量新增
        //将attr的json数组字符串 转为json数组对象
        JSONArray objects = JSONObject.parseArray(attr);
        for (int i = 0; i <objects.size() ; i++) {
            //构建属性数据对象
            ProductAttrDatas temp=new ProductAttrDatas();
            //设置对应的商品id
            temp.setProId(product.getId());
            temp.setAttrData(objects.get(i).toString());
            //放入集合
            adList.add(temp);
        }

        //将sku的json数组字符串 转为json数组对象
        JSONArray objectssku = JSONObject.parseArray(sku);
        for (int i = 0; i <objectssku.size() ; i++) {
            //得到具体一个json对象
           JSONObject dataJs= (JSONObject) objectssku.get(i);
            //构建属性数据对象
            ProductAttrDatas temp=new ProductAttrDatas();
            //设置对应的商品id
            temp.setProId(product.getId());
            temp.setPrice(dataJs.getDouble("pricess"));
            temp.setStorcks(dataJs.getInteger("storcks"));
            dataJs.remove("price");
            dataJs.remove("storck");
            temp.setAttrData(objectssku.get(i).toString());
            //放入集合
            adList.add(temp);
        }
        //批量新增
        productAttrDatasDao.adds(adList);

    }


    public static void main(String[] args) {
        String str="[{'id':12,'name':'张三','weigth':100,'age':20},{'id':13,'name':'张三33','weigth':120,'age':10},{'id':15,'name':'张三444','weigth':150,'age':50}]";
        //将字符串转为json数组
        JSONArray datas=JSONObject.parseArray(str);
        for (int i = 0; i <datas.size() ; i++) {
            //得到一个json对象
            JSONObject ojb= (JSONObject) datas.get(i);

            System.out.println("体重是："+ojb.getDouble("weigth"));
            System.out.println("年龄是："+ojb.getDouble("age"));
            ojb.remove("weigth");
            ojb.remove("age");
            System.out.println(ojb.toJSONString());

        }

    }
}
