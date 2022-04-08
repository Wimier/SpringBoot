package com.example.demo10.service;

import com.example.demo10.model.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wmy
 * @since 2022-04-08
 */
public interface TeacherService extends IService<Teacher> {
    List<Teacher> findAllTeacher();
    int deleteTeacher();

}
