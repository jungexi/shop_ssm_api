package com.jgxi.api.controller;

import com.jgxi.api.entity.vo.ReponseData;
import com.jgxi.api.service.BandService;
import com.jgxi.api.utils.OssFileUtils_JGXI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("api/band")
public class BandController {
    @Autowired
    private BandService bandService;
    @RequestMapping("uploadFile")
    public ReponseData uploadFile(MultipartFile file) throws IOException {
        //处理新名称
        String originalFilename = file.getOriginalFilename();
        //防止中文引起的错误
        String newName= UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
        //存储路径
        newName="imgs/"+newName;
        return ReponseData.success(OssFileUtils_JGXI.uploadFile(file.getInputStream(),newName));
    }

}
