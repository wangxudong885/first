package com.company.first.service.iservice;

import com.company.first.commons.ResResult;
import com.company.first.dao.idao.UserDao;
import com.company.first.dao.pojo.User;
import com.company.first.service.impl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;
    @Override
    public ResResult<User> login(String username, String password) {
        ResResult<User> result=null;
        try{
            result =userDao.login(username,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
