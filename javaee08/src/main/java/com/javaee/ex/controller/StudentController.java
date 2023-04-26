package com.javaee.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//学号id、姓名name、性别sex、年龄age、籍贯native及电话tel
@Controller
@RequestMapping("/user")
public class StudentController {
    @RequestMapping("/add_student")
    public String toLogin() {
        return "user/add_student";
    }

    @RequestMapping("/student_info")
    public String toRegister() {
        return "user/student_info";
    }

    @RequestMapping("/addStudent")
    public String login(Integer id,
                        String name,
                        String sex,
                        Integer age,
                        @RequestParam("native") String nat,
                        String tel,
                        Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        model.addAttribute("sex", sex);
        model.addAttribute("age", age);
        model.addAttribute("nat", nat);
        model.addAttribute("tel", tel);
        return "user/student_info";
    }
}
