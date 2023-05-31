package com.service.impl;

import com.mapper.CourseMapper;
import com.po.Course;
import com.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author LuoXuanwei
 * @date 2023/6/1 0:11
 */
@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> findAllCourse() {
        return courseMapper.selectCourses();
    }

    @Override
    public Course findCourseByCno(String cno) {
        return courseMapper.selectCourseByCno(cno);
    }

    @Override
    public void addCourse(Course course) {
        courseMapper.insertCourse(course);
    }

    @Override
    public void deleteCourses(String[] cnoArray) {
        for (int i = 0; i < cnoArray.length; i++) {
            courseMapper.deleteCourseByCno(cnoArray[i]);
        }
    }

    @Override
    public void updateCourse(Course course) {
        courseMapper.updateCourse(course);
    }
}
