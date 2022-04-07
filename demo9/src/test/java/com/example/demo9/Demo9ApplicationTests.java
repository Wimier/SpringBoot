package com.example.demo9;

import com.example.demo9.dao.StuDao;
import com.example.demo9.model.Stu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo9ApplicationTests {
    @Autowired
    private StuDao stuDao;
    @Test
    void deleteT(){
        stuDao.deleteById(205);
    }
    @Test
    void contextLoads() {
        stuDao.insert(new Stu(207,"kl",23));
    }
    @Test
    void showOne(){
        Stu stu=stuDao.selectById(202);
        System.out.println("stu = " + stu);
    }
    @Test
    void showAll(){
        List<Stu> stus=stuDao.selectList(null);
        System.out.println("stus = " + stus);
    }

}
