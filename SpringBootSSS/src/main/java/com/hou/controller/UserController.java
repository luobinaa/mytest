package com.hou.controller;

import com.hou.common.CodeMenu;
import com.hou.common.ResponseResult;
import com.hou.dao.UserDao;
import com.hou.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserDao userDao;

//    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @GetMapping("/findAll")
    public ResponseResult<User> findAll() {

        List<User> all = userDao.findAll();
        ResponseResult<User> users = new ResponseResult<>(true, CodeMenu.SUCCESS);
        users.setUser(new User());
        users.setUserlist(all);

        return users;
    }
}
