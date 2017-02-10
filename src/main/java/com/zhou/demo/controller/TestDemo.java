package com.zhou.demo.controller;


import com.zhou.demo.entity.User;
import com.zhou.demo.service.impl.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ZhouXiang on 2017/2/9 15:28.
 */

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring/ApplicationContext.xml" })

public class TestDemo {
    @Autowired
    private UserService userService;

    private static Logger LOG = Logger.getLogger(TestDemo.class);
    @Test
    public void test1(){
        User user = userService.getUserById(4);
        System.out.println(user);
        LOG.info(user);
    }
}
