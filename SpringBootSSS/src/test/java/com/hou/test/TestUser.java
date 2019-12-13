package com.hou.test;

import com.hou.MyApp;
import com.hou.dao.UserDao;
import com.hou.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApp.class)
public class TestUser {
    @Autowired
    private UserDao userDao;

    @Test
    public void test() {
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
