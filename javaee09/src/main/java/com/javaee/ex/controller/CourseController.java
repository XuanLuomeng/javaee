package com.javaee.ex.controller;

import com.javaee.ex.po.Course;
import com.javaee.ex.po.CourseEx;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CourseController {
    @RequestMapping(value = "/to_course_add_basic",
            method = RequestMethod.GET)
    public String toCourseAddBasic() {
        return "course/add_course_basic";
    }

    @RequestMapping(value = "/course_add_basic",
            method = RequestMethod.POST)
    public String courseAddBasic(int cid, String cname, int period,
                                 String bname, String pub, float price,
                                 Model model) {
        model.addAttribute("cid", cid);
        model.addAttribute("cname", cname);
        model.addAttribute("period", period);
        model.addAttribute("bname", bname);
        model.addAttribute("pub", pub);
        model.addAttribute("price", price);
        return "course/course_info_basic";
    }

    @GetMapping("/to_course_add_pojo")
    public String toCourseAddPojo() {
        return "course/add_course_pojo";
    }

    @PostMapping("/course_add_pojo")
    public String courseAddPojo(Course course, Model model) {
        System.out.println(course.getCno());
        model.addAttribute("course", course.getCno());
        return "course/course_info_pojo";
    }

    @GetMapping("/to_course_add_pojo_nest")
    public String toCourseAddNestPojo() {
        return "course/add_course_pojo_nest";
    }

    @PostMapping("/course_add_pojo_nest")
    public String courseAddNestPojo(CourseEx courseEx, Model model) {
        model.addAttribute("course", courseEx);
        return "course/course_info_pojo_nest";
    }

}
