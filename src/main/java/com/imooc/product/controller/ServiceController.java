package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lihaochun on 2018/11/3.
 */
@RestController
public class ServiceController {
    @GetMapping("/msg")
    public String msg(){
        return "this is product msg";
    }

}
