package com.hu.test;

import com.hu.Utils.SQLSession;
import com.hu.bean.Employee;
import com.hu.dao.EmployeeDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestStudent {

    private EmployeeDao employeeDao;
    private SqlSession sqlSession;
   @BeforeEach
    public  void intS(){

       sqlSession= SQLSession.getSqlSession();
       employeeDao=sqlSession.getMapper(EmployeeDao.class);
    }

    @Test
    public  void selectTeamLoader() {
         Employee employee = employeeDao.selectLoader(1005);
       System.out.println(
               employee
       );
    }









}
