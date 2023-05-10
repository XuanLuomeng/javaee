package com.javaee.ex.controller;

import com.javaee.ex.po.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @GetMapping("/to_add_student")
    public String toAddStudent() {
        return "student/add_student";
    }

    @PostMapping("/add_student")
    public String addStudent(Student student, Model model) {
        model.addAttribute("student", student);
        return "student/student_info";
    }
}
