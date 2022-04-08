package com.example.demo10.service.impl;

import com.example.demo10.mapper.StuMapper;
import com.example.demo10.model.Student;
import com.example.demo10.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
    private StuMapper stuMapper;
    @Override
    public List<Student> findAllStudent(){
        return stuMapper.selectList(null);
    }
}
