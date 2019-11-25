package com.company.first.service.iservice;

import com.company.first.commons.ResResult;
import com.company.first.dao.pojo.User;
import com.company.first.service.impl.IUserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceImplTest {
    @Autowired
    IUserService userService;
    @Test
    public void login() {
        ResResult<User> rr =userService.login("scott","tiger");
        TestCase.assertNotNull(rr.getData());
        System.out.println(rr);
        ResResult<User> rr2 =userService.login("scott","aaaaa");
        System.out.println(rr2);
    }
}