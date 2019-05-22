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
    public  void  selectAllStudent()
    {
        Student student=new Student();
        student.setName("刘");
        student.setAge(10);
        List<Student> list=studentDao.selectIf(student);
        list.forEach(student1 ->{
            System.out.println(student1);
        } );
    }
   @Test
    public  void selectWhere()
   {
       Student student=new Student();
       student.setName("刘");
       student.setAge(10);
       List<Student> list=studentDao.selectWhere(student);
       list.forEach(student1 ->{
           System.out.println(student1);
       } );
   }

   @Test
    public void selectFOREACH()
   {

       int[] ids=new int[]{1,5};
       List<Student> students=studentDao.selectForEach(ids);
       students.forEach((s)-> {
           System.out.println(s);
       });

   }


}
