package com.example.demo10.service.impl;

import com.example.demo10.mapper.StuMapper;
import com.example.demo10.model.Student;
import com.example.demo10.model.Teacher;
import com.example.demo10.mapper.TeacherMapper;
import com.example.demo10.service.TeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wmy
 * @since 2022-04-08
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> findAllTeacher() {
        return teacherMapper.selectList(null);
    }

    @Override
    public int deleteTeacher() {
        int ref = teacherMapper.deleteById(302);
        return ref;
    }

    @Override
    public boolean updateById(Teacher entity) {
        return super.updateById(entity);
    }
}