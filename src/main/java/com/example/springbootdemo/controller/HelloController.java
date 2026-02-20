package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    /**
     * 首页 - 显示 Hello World 页面
     */
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello World");
        return "hello";
    }

    /**
     * REST API - 返回 Hello World
     */
    @GetMapping("/api/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }
}
