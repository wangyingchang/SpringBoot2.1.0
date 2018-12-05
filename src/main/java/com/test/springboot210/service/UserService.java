package com.test.springboot210.service;

import com.test.springboot210.model.User;

import java.util.List;

/**
 * @author Time
 * @date 2018-11-30 15:27
 */
public interface UserService {
     List<User> getUser();
     User selectById(Long id);
}
