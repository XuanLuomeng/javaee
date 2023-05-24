package com.controller;

import com.po.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LuoXuanwei
 * @date 2023/5/25 0:23
 */
@Controller
public class StudentController {
    @RequestMapping(value = "/studentadd")
    public String courseAdd(/*String no, String name, int age, String snative, float height, float weight, String id,*/
            Student student
            , Model model) {
//        model.addAttribute("no", no);
//        model.addAttribute("name", name);
//        model.addAttribute("age", age);
//        model.addAttribute("snative", snative);
//        model.addAttribute("height", height);
//        model.addAttribute("weight", weight);
//        model.addAttribute("id", id);
        model.addAttribute("student", student);

        return "studentinfo";
    }
}
