package com.test.springboot210.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.springboot210.model.User;
import com.test.springboot210.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Time
 * @date 2018-11-30 15:29
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public PageInfo<User> list(@RequestParam(defaultValue = "1")int pageCode,
                               @RequestParam(defaultValue = "2")int pageSize){
        // 分页代码PageHelper.startPage(pageNo,pageSize),只对其后的第一个查询有效
        PageHelper.startPage(pageCode,pageSize);
        List<User> list=userService.getUser();
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @GetMapping("/user/{id}")
    public User selectUserById(@PathVariable("id") Long id){
        return userService.selectById(id);
    }
}
