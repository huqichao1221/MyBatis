package com.hu.dao;

import com.hu.bean.Course;
import com.hu.bean.Student;

import java.util.List;

public interface CourseDao {


    Course selectAllToAll(int id);
    Student selectAllToAllStudent(int id);
}
