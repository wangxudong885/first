package com.company.first.service.impl;

import com.company.first.commons.ResResult;
import com.company.first.dao.pojo.User;

public interface IUserService {
    ResResult<User> login(String username,String password);
}
