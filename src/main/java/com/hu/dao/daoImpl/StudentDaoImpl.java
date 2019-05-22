package com.hu.dao.daoImpl;

import com.hu.Utils.SQLSession;
import com.hu.bean.Student;
import com.hu.dao.StudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private SqlSession sqlSession;
    @Override
    public void insertStudent(Student student) {



            //读取主配置文件
           // InputStream input = Resources.getResourceAsStream("mybaits.xml");
            //创建SqlSessionFactory对象
           // SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(input);
            //创建SqlSession对象
            sqlSession = SQLSession.getSqlSession();
            //新增数据操作
            sqlSession.insert("insertStudent", student);
            //提交SqlSession
            sqlSession.commit();


    }

    @Override
    public void deletStudent(int id) {


      sqlSession=  SQLSession.getSqlSession();
      sqlSession.delete("deletStudent",id);
      sqlSession.commit();

    }

    @Override
    public void updateStudent(Student student) {
        sqlSession=SQLSession.getSqlSession();
        sqlSession.update("updateStudent",student);
        sqlSession.commit();
    }

    @Override
    public List<Student> selectAllStudent() {
        sqlSession=SQLSession.getSqlSession();
        List<Student> list=  sqlSession.selectList("selectAllStudent");
        sqlSession.commit();
        return  list;
    }

    @Override
    public Student selectStudentById(int id) {
        sqlSession=SQLSession.getSqlSession();
        Student student=sqlSession.selectOne("selectStudentByID",id);
        return student;
    }

    @Override
    public List<Student> selectByName(String name) {

        sqlSession=SQLSession.getSqlSession();
        List<Student> list=  sqlSession.selectList("selectByName",name);
        sqlSession.commit();
        return  list;

    }

    @Override
    public Student selectStudentByIdMatch(int id) {
        sqlSession=SQLSession.getSqlSession();
        Student student=sqlSession.selectOne("selectStudentByIDMatch",id);
        return student;
    }
}
