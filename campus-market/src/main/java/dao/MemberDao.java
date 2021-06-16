package dao;

import domain.Member;
import domain.User;
import lib.GetSession;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MemberDao {

//    传统操作
    public void insert(Member member){
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

       InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.xml");

        SqlSessionFactory factory = builder.build(inputStream);

        SqlSession session =  factory.openSession(true);

        System.out.println(session == null);
          List<User> list =   session.selectList("findUserAll");
        System.out.println(list.size());
    }


    public static void main(String[] args) {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.xml");

        SqlSessionFactory factory = builder.build(inputStream);

        SqlSession session =  factory.openSession(true);

        System.out.println(session == null);
        List<User> list =   session.selectList("findUserAll");
        System.out.println(list.size());
    }

//    工厂操作
    public void addUser(User user){
        SqlSession session = GetSession.getSqlSession();

        session.insert("addUser");

    }




    //    工厂操作
    public void findUserAll(){
        SqlSession session = GetSession.getSqlSession();

        session.selectList("findUserAll");

    }
}
