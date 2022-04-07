package com.example.demo9.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo9.model.Stu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@TableName("Stu")
public interface StuDao extends BaseMapper<Stu> {
}
