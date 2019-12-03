package com.springboot.entity;

import org.springframework.stereotype.Component;

/**
 * @author jay.wang
 * @create 2019-12-02-11:12
 **/
@Component
public class Student {

    private Integer id;

    private String username;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
