package com.test.springboot210.model;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Time
 * @date 2018-11-30 14:24
 * 由Spring根据@ConfigurationProperties自动注入属性的值
 */
@Table(name="tbl_user")
public class User {
    @Id
    private Long userId;
    private String userName;
    private Integer userAge;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}
