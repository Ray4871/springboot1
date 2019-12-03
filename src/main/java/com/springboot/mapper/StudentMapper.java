package com.springboot.mapper;

import com.springboot.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author jay.wang
 * @create 2019-12-02-11:13
 **/
//@Mapper
@Repository
public interface StudentMapper {

//    @Select("select * from student where id=#{id}")
    public Student getStudentById(Integer id);

//    @Options(useGeneratedKeys = true,keyProperty = "id")
//    @Insert("insert into  ssss")
    public int insertStudent(Student student);


}
