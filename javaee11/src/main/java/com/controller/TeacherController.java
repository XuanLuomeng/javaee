package com.controller;

import com.po.TeacherCourse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LuoXuanwei
 * @date 2023/5/25 0:55
 */
@Controller
public class TeacherController {
    @RequestMapping("/teachercourses")
    public String chooseCourse(TeacherCourse teacherCourse, Model model) {
        model.addAttribute("teachercourse", teacherCourse);
        return "teachercourseinfo";
    }
}
