package com.sxtx.service;

import com.sxtx.model.User;
import java.util.List;

public interface TestService {

    List<User> queryUser();

    int addUser(User users);
}
