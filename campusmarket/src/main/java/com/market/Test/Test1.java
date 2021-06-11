package com.market.Test;
import com.market.Test.dao.InsertDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.InputStream;

public class Test1 {


    public static void main(String[] args) {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml");
        System.out.println(inputStream);
        SqlSessionFactory  factory = builder.build(inputStream);


        SqlSession sqlSession = factory.openSession();

        sqlSession.insert("insert");

        InsertDao in  = new InsertDao();
        in.insertDao();

    }


}
