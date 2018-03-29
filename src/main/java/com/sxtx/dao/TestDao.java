package com.sxtx.dao;

import com.sxtx.model.User;

import java.util.List;

public interface TestDao {

    List<User> queryUser();

    int addUser(User users);
}
