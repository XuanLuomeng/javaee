package com.javaee.dao;

import com.javaee.po.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {
    @Select("select * from book where id=#{id};")
    Book findBookById(int id);
    @Select("select * from book;")
    List<Book> findBookAll();
    @Select("select * from book where bname like '%${bname}%';")
    List<Book> findBookByBname(String bname);
    @Insert("insert into book(id,bname,price,pub) values(#{id},#{bname},#{price},#{pub});")
    int insertBook(Book book);
    @Update({"update book set id=#{id},bname=#{bname},price=#{price},pub=#{pub}"," where id=#{id};"})
    int updateBook(Book book);
    @Delete("delete from book where " + "id=#{id};")
    int deleteBookById(int id);
}
