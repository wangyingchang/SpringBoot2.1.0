package com.test.springboot210;

import com.test.springboot210.model.User;
import com.test.springboot210.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Time
 * @date 2018-11-30 15:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;
    @Test
    public void test(){
        List<User> userList=userService.getUser();
        System.out.println(userList);
    }
}
