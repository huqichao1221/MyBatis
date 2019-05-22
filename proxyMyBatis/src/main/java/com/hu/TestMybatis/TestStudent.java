package com.hu.TestMybatis;

import com.hu.Utils.SQLSession;
import com.hu.bean.Student;
import com.hu.dao.StudentDao;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestStudent {

    private  StudentDao studentDao;
    private SqlSession sqlSession;
   @BeforeEach
    public  void intS(){

       sqlSession= SQLSession.getSqlSession();
       studentDao=sqlSession.getMapper(StudentDao.class);
    }
    @Test
    public void insertStudent(){

        Student student = new Student("刘德华",52,95);

        studentDao.insertStudent(student);
        System.out.println(student);
    }


    @Test
    public void DeletStudent()
    {

        studentDao.deletStudent(3);

    }
    @Test
    public  void updateStudent()
    {
        Student student=new Student("周杰伦",50,60);
        student.setId(2);
        studentDao.updateStudent(student);
    }
    @Test
    public  void  selectAllStudent()
    {
        List<Student> list=studentDao.selectAllStudent();
        list.forEach(student ->{
            System.out.println(student);
        } );
    }
    @Test
    public void seletOneByID(){

      Student student= studentDao.selectStudentById(2);
        System.out.println(student);
        Student student1= studentDao.selectStudentById(2);
    }

    @Test
    void selectByName()
    {
        List<Student> list =studentDao.selectByName("刘");
        list.forEach(student ->{
            System.out.println(student);
        } );

    }

    @Test
    public void seletOneByIDMatch(){

        Student student= studentDao.selectStudentByIdMatch(2);
        System.out.println(student);
    }

}
