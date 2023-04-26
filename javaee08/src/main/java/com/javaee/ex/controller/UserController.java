package com.javaee.ex.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user") // 公共请求路径
public class UserController {
    @RequestMapping("/to_login")
    public String toLogin() {
        return "user/login"; // 经过视图解析器解析
    }

    @RequestMapping("/to_register")
    public String toRegister() {
        return "user/register";
    }

    @RequestMapping("/register")
    public String register(@RequestParam("register_name") String registerName,
                           String password, Model model) {
        if (!password.equals("123456")) {
            model.addAttribute("login_error", "注册失败，请重试！");
            return "forward:to_register";
        }
        model.addAttribute("login_name", registerName);
        model.addAttribute(password);
        return "user/main";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("login_name") String loginName,
                        String password, Model model) {
        if (!password.equals("888888")) {
            model.addAttribute("login_error", "登录失败，请重试！");
            return "forward:to_login"; // 转发请求（不含公共路径）
            //return "redirect:to_login"; // 重定向请求（不含公共路径）
        }
        model.addAttribute("login_name", loginName);
        model.addAttribute(password);
        return "user/main";
    }

    @RequestMapping("/to_index")
    public String toIndex() {
        return "redirect:/index.jsp"; // 重定向到页面，不被解析，“/”表示从根相对路径开始，若无“/”，则从当前公共路径“user”开始
    }
}

