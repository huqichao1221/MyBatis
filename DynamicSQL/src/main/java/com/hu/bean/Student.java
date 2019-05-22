package com.hu.bean;

//@Alias("Stu")
public class Student {

    private int id;

    private String name;

    private int age;

    private double score;

    private  String pwd;
    public int getId() {
        return id;
    }

    public Student() {
    }

    public Student(int id, String name, int age, double score, String pwd) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.pwd=pwd;
    }

    public Student(int id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
