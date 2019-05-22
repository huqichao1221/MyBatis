package com.hu.test;

import com.hu.Utils.SQLSession;

import com.hu.bean.Course;

import com.hu.bean.Student;
import com.hu.dao.CourseDao;


import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestStudent {

    private CourseDao courseDao;
    private SqlSession sqlSession;
   @BeforeEach
    public  void intS(){

       sqlSession= SQLSession.getSqlSession();
       courseDao=sqlSession.getMapper(CourseDao.class);
    }

    @Test
    public  void selectTeam() {
       Course c = courseDao.selectAllToAll(1001);
        System.out.println(c);
    }

    @Test
    public  void selectTeamStudnet() {
        Student c = courseDao.selectAllToAllStudent(1);
        System.out.println(c);
    }
    }









