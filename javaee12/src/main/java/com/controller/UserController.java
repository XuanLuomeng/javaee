package com.controller;

import com.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * @author LuoXuanwei
 * @date 2023/5/25 1:05
 */
@Controller
public class UserController {
    @RequestMapping(value = "/tologout", method = RequestMethod.GET)
    public String toLogout(HttpSession session) {
        session.invalidate();
        return "login";
    }

    @RequestMapping(value = "/userlogin", method = RequestMethod.POST)
    public String userLogin(User user, HttpSession session, Model model) {
        if (user.getUsername() != "" || user.getUsername() != null) {
            session.setAttribute("username", user.getUsername());
        }
        return "main";
    }

    @RequestMapping(value = "/tomain", method = RequestMethod.GET)
    public String toMain() {
        return "main";
    }
}

