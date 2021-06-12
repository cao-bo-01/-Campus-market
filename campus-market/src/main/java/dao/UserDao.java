package dao;

import lib.GetSession;
import org.apache.ibatis.session.SqlSession;

public class UserDao {

 private static   SqlSession session = GetSession.getSqlSession();




    public static int insertUser(){
        System.out.println((session == null )+"USER dao "+"                1");
      return   session.insert("addUser");
    }

}
