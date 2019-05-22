package com.hu.bean;

import java.util.List;

public class Employee {

    private  int id;
    private  String name;
    private  String job;
    private int  mgr ;

    private List<Employee> employeelist;

    public List<Employee> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(List<Employee> employeelist) {
        this.employeelist = employeelist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", employeelist=" + employeelist +
                '}';
    }
}
