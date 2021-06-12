package dao;

import domain.User;
import lib.GetSession;
import org.apache.ibatis.session.SqlSession;

public class UserDao {


    public static int insertUser(){
        SqlSession session = GetSession.getSqlSession();
        System.out.println((session == null )+"USER dao "+"                1");
      return   session.insert("addUser");
    }

}
