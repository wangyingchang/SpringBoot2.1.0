package com.test.springboot210.common;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author Time
 * @date 2018-11-30 17:16
 * @desc 自己的Mapper基类，不能放到mapper文件夹下
 */
public interface MyMapper<T> extends BaseMapper<T>, Mapper<T>, MySqlMapper<T>, ConditionMapper<T> {

}
