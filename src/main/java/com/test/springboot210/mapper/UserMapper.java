package com.test.springboot210.mapper;

import com.test.springboot210.common.MyMapper;
import com.test.springboot210.model.User;

import java.util.List;

/**
 * @author Time
 * @date 2018-11-30 15:25
 */
public interface UserMapper extends MyMapper<User> {
    List<User> getUser();
}
