package com.hu.dao;

import com.hu.bean.Student;

import java.util.List;

public interface StudentDao {

    void insertStudent(Student student);
    void deletStudent(int id);
    void  updateStudent(Student student);
    List<Student> selectAllStudent();
    Student selectStudentById( int id);
    List<Student> selectByName(String name);
    Student selectStudentByIdMatch( int id);

}
