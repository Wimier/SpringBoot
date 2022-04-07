package com.example.demo4.controller;

import com.example.demo4.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class Mycontroller {
    @GetMapping("ok1")
    public String demo(Model model) {
        Student zhangSan = new Student(18, 1001, "zhangSan");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(19, 1002, "LiSi"));
        students.add(new Student(18, 1003, "WangWu"));
        students.add(new Student(20, 1004, "ZhaoLiu"));
        model.addAttribute("stu", zhangSan);
        model.addAttribute("stuList", students);
        return "layout";
    }

    @GetMapping("mm")
    public String main(Model model) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(19, 1002, "LiSi"));
        students.add(new Student(18, 1003, "WangWu"));
        students.add(new Student(20, 1004, "ZhaoLiu"));
        model.addAttribute("stuList", students);
        return "main";
    }
}
