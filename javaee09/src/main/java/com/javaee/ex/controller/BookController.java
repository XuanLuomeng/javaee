package com.javaee.ex.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javaee.ex.po.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class BookController {
    @GetMapping("/to_book_list")
    public String toBookList() {
        return "book/book_list";
    }

    @PostMapping("/add_book")
    @ResponseBody
    public void addBook(HttpServletResponse resp, Book book) throws IOException {
        String data = "OK";
        System.out.println(book.toString());
        //设置content-type防止乱码问题
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(data);
    }
}
