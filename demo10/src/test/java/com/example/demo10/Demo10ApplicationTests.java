package com.example.demo10;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo10.mapper.StuMapper;
import com.example.demo10.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
class Demo10ApplicationTests {
    @Autowired
    private StuMapper stuMapper;

    @Test
    void contextLoads() {
        QueryWrapper<Student> wrapper=new QueryWrapper<>();
        //wrapper.eq("name","zhou");
        wrapper.ge("age",19).like("name","j");//ge()是>=，gt是>
        List<Student> students = stuMapper.selectList(wrapper);
        for(Student student : students){
            System.out.println("student = " + student);
        }

    }
    @Test
    void updateTest(){
        Student student=new Student();
        student.setId(207);
        student.setName("jkk");//此方法根据id更新数据
        stuMapper.updateById(student);
    }
    @Test
    void updateTest1(){
        Student student=new Student();
        student.setId(201);
        student.setName("jkk");
        HashMap<String,Object> map = new HashMap<>();
        map.put("name","zhou");
        map.put("age",30);//此方法根据id更新数据
        stuMapper.selectByMap(map);
        System.out.println("map = " + map);
    }

}
