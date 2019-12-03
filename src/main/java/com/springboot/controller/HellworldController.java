package com.springboot.controller;

import com.springboot.entity.Student;
import com.springboot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jay.wang
 * @create 2019-12-02-11:22
 **/
@RestController
public class HellworldController {

    @Autowired
    StudentMapper studentMapper;


    @RequestMapping("/student")
    public Student getStudentByID()
    {
        return studentMapper.getStudentById(1);
    }


}
