package com.hu.dao;

import com.hu.bean.Student;

import java.util.List;

public interface StudentDao {

    public  List<Student> selectIf(Student student);
    public  List<Student> selectWhere(Student student);
    public  List<Student> selectForEach(int[] id);

}
