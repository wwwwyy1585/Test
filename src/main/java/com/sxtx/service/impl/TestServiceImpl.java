package com.sxtx.service.impl;

import com.sxtx.dao.TestDao;
import com.sxtx.model.User;
import com.sxtx.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao testDao;

    @Transactional
    @Override
    public List<User> queryUser() {
        System.out.print("hhhhhhh");
        return testDao.queryUser();
    }

    @Transactional
    @Override
    public int addUser(User users) {
        int n=testDao.addUser(users);
        return n;
    }
}
