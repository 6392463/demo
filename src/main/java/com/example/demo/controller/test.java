package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test{

    @RequestMapping("/test")
     public String demo(){
         System.out.println("这是第一次测试vscode的代码");
         return "第一次使用vscode";
     }

}