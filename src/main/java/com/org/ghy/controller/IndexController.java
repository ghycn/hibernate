package com.org.ghy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/19.
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/index.do")
    public String index(){
        System.out.println(1);
        return "index";
    }
}
