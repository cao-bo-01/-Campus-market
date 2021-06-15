package dao;

import domain.User;
import lib.GetSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDao {

 private static   SqlSession session = GetSession.getSqlSession();




    public static int insertUser(){
        System.out.println((session == null )+"USER dao "+"                1");
      return   session.insert("addUser");
    }




    public static void  findUserAll(){
       List<User> userList =   session.selectList("findUserAll");
       for (User user:userList){
           System.out.println(user);
       }
    }

}
