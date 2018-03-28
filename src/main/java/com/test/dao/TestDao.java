package com.test.dao;

import com.alibaba.fastjson.JSONObject;
import com.test.model.User;

import java.util.List;

public interface TestDao {

    List<User> queryUser();

    int addUser(User users);
}
