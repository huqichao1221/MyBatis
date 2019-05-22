package com.hu.dao;

import com.hu.bean.Employee;

import java.util.List;

public interface EmployeeDao {


    List<Employee> selectAutoOneToKey(int id);
    List<Employee> selectAutoOneToKeySelf(int id);

}
