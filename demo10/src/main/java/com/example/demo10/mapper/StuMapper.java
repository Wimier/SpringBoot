package com.example.demo10.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo10.model.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StuMapper extends BaseMapper<Student> {
}
