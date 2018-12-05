package com.test.springboot210.service.serviceImpl;

import com.test.springboot210.mapper.UserMapper;
import com.test.springboot210.model.User;
import com.test.springboot210.service.UserService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Time
 * @date 2018-11-30 15:35
 */
@Service
@CacheConfig(cacheNames = "grades")
public class UserServiceImple implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    @Cacheable
    public List<User> getUser(){
        return userMapper.getUser();
    }

    @Override
    @Cacheable
    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
