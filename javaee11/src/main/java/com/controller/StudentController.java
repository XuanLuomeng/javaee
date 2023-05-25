package com.controller;

import com.po.StuCourse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LuoXuanwei
 * @date 2023/5/25 0:53
 */
@Controller
public class StudentController {
    @RequestMapping("/stucourses")
    public String chooseCourse(StuCourse stuCourse, Model model) {
        model.addAttribute("stucourse", stuCourse);
        return "stucourseinfo";
    }
}
