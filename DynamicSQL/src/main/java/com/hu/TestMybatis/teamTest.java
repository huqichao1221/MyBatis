package com.hu.TestMybatis;

import com.hu.Utils.SQLSession;
import com.hu.bean.Team;
import com.hu.dao.TeamDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class teamTest {

    private SqlSession sqlSession;
    private TeamDao teamDao;

    @BeforeEach
    public  void init()
    {
        sqlSession= SQLSession.getSqlSession();
        teamDao=sqlSession.getMapper(TeamDao.class);
    }

    @Test
    public  void selectTeam()
    {
        Team team=teamDao.selectTeamPlayer(1);
        System.out.println(team);
    }



}
