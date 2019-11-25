package com.company.first.dao.idao;

import com.company.first.commons.ResResult;
import com.company.first.dao.pojo.User;

public interface UserDao {
    ResResult<User> login(String username, String password)throws Exception;
}
