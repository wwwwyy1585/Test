package com.test.service;

import com.alibaba.fastjson.JSONObject;
import com.test.model.User;
import java.util.List;

public interface TestService {

    List<User> queryUser();

    int addUser(User users);
}
