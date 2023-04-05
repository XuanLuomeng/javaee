package com.javaee.dao;

import com.javaee.po.Student;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface IdCardStusentDao {
    @Select("select * from stu where sno=#{sno};")
    @Results({@Result(column = "card_id",property = "idCard",one=@One(select = "com.javaee.dao.IdCardDao.findIdCardById"))})
    Student findStudentIdCardBySno(String sno);
}
