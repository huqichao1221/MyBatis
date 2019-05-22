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
    public  void selectTeam() {
        List<Employee> employees = employeeDao.selectAutoOneToKey(1002);
        employees.forEach((e) -> {
            System.out.println(e);
        });
    }
    @Test
    public  void selectTeamelself() {
        List<Employee> employees = employeeDao.selectAutoOneToKeySelf(1002);
        employees.forEach((e) -> {
            System.out.println(e);
        });
    }








}
