package com.zhou.demo.service.impl;

import com.zhou.demo.dao.IUserDao;
import com.zhou.demo.entity.User;
import com.zhou.demo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by ZhouXiang on 2017/2/9 10:21.
 */
@Service("userService")
public class UserService implements IUserService {
    @Resource
    private IUserDao userDao;
    @Override
    public User getUserById(int id) {
        return this.userDao.selectByPrimaryKey(id);
    }
}
