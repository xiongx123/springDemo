//package com.xiongchao.gulimall.third.party;
//
//import com.aliyun.oss.OSSClient;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.io.File;
//
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class GulimallThridPartyAppTest {
//
//    @Autowired
//    private OSSClient ossClient;
//
//    @Test
//    public void upload(){
//        String bucketName = "gulimall-xc1992";
//        String objectName = "3c24f9cd69534030.jpg";
//        ossClient.putObject(bucketName, objectName, new File("E:\\github\\分布式基础篇资料源码\\pics\\3c24f9cd69534030.jpg"));
//
//    }
//
//}