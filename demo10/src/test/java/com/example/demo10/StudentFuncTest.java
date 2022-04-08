package com.example.demo10;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo10.model.Student;
import com.example.demo10.model.Teacher;
import com.example.demo10.service.StudentService;
import com.example.demo10.service.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
//作业二：在数据库中定义教师表与学生表，使用代码生成功能生成model、controller、service和mapper的相关代码。
// 使用生成的service对增删查改操作各测试一次。再使用service中的函数测试一次分页操作。
@SpringBootTest
public class StudentFuncTest {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;
    @Test
    void testFind(){
        List<Student> students =studentService.findAllStudent();
        for( Student student: students){
            System.out.println("student = " + student);
        }
    }
    @Test
    void testInsert(){
        Teacher teacher = new Teacher();
        teacher.setId(304);
        teacher.setName("pow");
        teacher.setAge(28);
        teacherService.save(teacher);
        System.out.println("teacher = " + teacher);
    }
    @Test
    void testSelect(){
        List<Teacher> teachers = teacherService.findAllTeacher();
        for(Teacher teacher:teachers){
            System.out.println("teacher = " + teacher);
        }
    }
    @Test
    void deleteTest(){
        int ref = teacherService.deleteTeacher();
        System.out.println("ref = " + ref);
    }
    @Test
    void updateTest(){
        Teacher teacher = new Teacher();
        teacher.setId(301);
        teacher.setAge(55);
        teacher.setName("fg");
        teacherService.updateById(teacher);
        System.out.println("teacher = " + teacher);
    }
    @Test
    public void testPage(){
        Page<Teacher> page = new Page<>(1,2);
        teacherService.page(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getTotal());
        System.out.println(page.getSize());
        System.out.println(page.getRecords());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }


}
