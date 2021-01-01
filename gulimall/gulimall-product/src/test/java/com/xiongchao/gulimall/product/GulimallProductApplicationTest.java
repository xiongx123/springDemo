package com.xiongchao.gulimall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.GetObjectRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayInputStream;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTest {

    @Autowired
    private OSSClient ossClient;

    @Test
    public void upload(){
        String bucketName = "gulimall-xc1992";
        String objectName = "3c24f9cd69534030.jpg";
        ossClient.putObject(bucketName, objectName, new File("E:\\github\\分布式基础篇资料源码\\pics\\3c24f9cd69534030.jpg"));

    }


    @Test
    public void test() {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "https://oss-cn-shanghai.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
        String accessKeyId = "LTAI4G4Kw7sNPBLfHJ6Sc2D5";
        String accessKeySecret = "uE1LzNa4IcapNHg7nuZpS1tQmL09H9";
        String bucketName = "gulimall-xc1992";
// <yourObjectName>上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。
        String objectName = "0d40c24b264aa511.jpg";

// 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

// 上传文件到指定的存储空间（bucketName）并将其保存为指定的文件名称（objectName）。
        String content = "E:\\github\\分布式基础篇资料源码\\pics\\0d40c24b264aa511.jpg";
        ossClient.putObject(bucketName, objectName, new ByteArrayInputStream(content.getBytes()));

// 关闭OSSClient。
        ossClient.shutdown();
    }

}