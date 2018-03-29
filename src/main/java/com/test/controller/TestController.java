package com.test.controller;

import com.alibaba.fastjson.JSONObject;
import com.test.model.User;
import com.test.redis.SxtxRedisTemplate;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@EnableAutoConfiguration
public class TestController {



    @Autowired
    private TestService testService ;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private SxtxRedisTemplate sxtxRedisTemplate;
    /**
     * 测试方法1
     * @return
     * 测试页面
     */
    @RequestMapping("toshow")
    public String ddddd(){

        return "test";
    }

    /**
     * 测试方法2(链接数据库)
     *@return
     * User集合
     */
    @RequestMapping("queryUser")
    @ResponseBody
    public Map<String,List<User>> queryUser(){

        List<User> list = testService.queryUser();
        Map<String,List<User>> map = new HashMap<String,List<User>>();
        map.put("users",list);
        return map;
    }

    /**
     * 操作数据库
     *
     */
    @RequestMapping("addUser")
    @ResponseBody
    public String addUser(){
        User users = new User();
        users.setUserName("你好");
        users.setUserPass("再见");
        int n = testService.addUser(users);
        System.out.print(n);
        return "sucecss";
    }
}
