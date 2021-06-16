package dao;

import org.apache.ibatis.session.SqlSession;

public class UserDao {

   static SqlSession sqlSession = lib.GetSession.getSqlSession();



}
