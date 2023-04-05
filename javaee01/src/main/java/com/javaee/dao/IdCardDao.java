package com.javaee.dao;

import com.javaee.po.Idcard;
import org.apache.ibatis.annotations.Select;

public interface IdCardDao {
    @Select("select * from idcard where id=#{id};")
    Idcard findIdCardById(int id);
}
