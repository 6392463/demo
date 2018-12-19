package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test{

    @RequestMapping("/test")
     public String demo(){
         return "第一次使用vscode";
     }

}