package com.javaee.dao;

import com.javaee.po.Sc;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ScDao {
    @Select("select * from sc where sno=#{sno};")
    List<Sc> findScBySno(String sno);
    @Select("select * from sc where cno=#{cno};")
    List<Sc> findScByCno(String sno);
}
