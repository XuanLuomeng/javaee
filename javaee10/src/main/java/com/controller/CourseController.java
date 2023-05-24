package com.controller;

import com.po.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LuoXuanwei
 * @date 2023/5/25 0:13
 */
@Controller
public class CourseController {
    @RequestMapping(value = "/courseadd")
    public String courseAdd(/*int cno, String cname, int period, String bname, String pub, float price,*/
            Course course,
            Model model) {
//        model.addAttribute("cno", cno);
//        model.addAttribute("cname", cname);
//        model.addAttribute("period", period);
//        model.addAttribute("bname", bname);
//        model.addAttribute("pub", pub);
//        model.addAttribute("price", price);
        model.addAttribute("course", course);

        return "courseinfo";
    }
}