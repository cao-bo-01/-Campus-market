package dao;

import domain.Member;
import domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MemberDao {

    public void insert(Member member){


        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

       InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.xml");

        SqlSessionFactory factory = builder.build(inputStream);

        SqlSession session =  factory.openSession(true);

        System.out.println(session == null);
                session.insert("insert");
    }



    public void addUser(User user){


        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.xml");

        SqlSessionFactory factory = builder.build(inputStream);

        SqlSession session =  factory.openSession(true);

        session.insert("addUser");
    }
}
