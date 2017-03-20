package com.org.ghy.controller;

import com.alibaba.fastjson.JSON;
import com.org.ghy.bean.UserEntity;
import com.org.ghy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/3/19.
 */
@Controller
public class IndexController {
    @Autowired
    private IUserService userService;


    @RequestMapping(value = "/index.do")
    public String index(){
        System.out.println(1);
        return "index";
    }

    /**
     * 查询有用户
     */
    @ResponseBody
    @RequestMapping(value = "/queryUser.do")
    public String queryUser(){
        List<UserEntity> list = userService.queryUser();
        return JSON.toJSONString(list);
    }

}
