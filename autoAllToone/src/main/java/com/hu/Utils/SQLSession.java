package com.hu.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SQLSession {

    private  static volatile SqlSessionFactory sqlSessionFactory;
    public  static  SqlSession getSqlSession() {


        try {
            if (sqlSessionFactory==null)
            {
                InputStream input = Resources.getResourceAsStream("mybaits.xml");
                synchronized (SQLSession.class)
                {
                    if (sqlSessionFactory==null)
                    {
                        sqlSessionFactory= new SqlSessionFactoryBuilder().build(input);
                    }
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
        return  sqlSessionFactory.openSession();

    }
    }














