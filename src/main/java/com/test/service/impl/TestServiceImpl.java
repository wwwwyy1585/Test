package com.test.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.test.dao.TestDao;
import com.test.model.User;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao testDao;

    @Override
    public List<User> queryUser() {
        System.out.print("hhhhhhh");
        return testDao.queryUser();
    }

    @Override
    public int addUser(User users) {
        int n = 0;
        try {
            n=testDao.addUser(users);
            int a = 1/0;
        }catch (Exception e){

        }
        return n;
    }
}
