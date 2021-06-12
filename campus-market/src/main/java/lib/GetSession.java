package lib;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

//工具类，单例，并且线程安全

public class GetSession {

    private static SqlSession session = null;

    static {
        if (session == null) {
//            synchronized (SqlSession.class) {
            System.out.println((session == null )+"工厂 静态块"+"                1");
                if (session == null) {
                    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

                    InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.xml");

                    SqlSessionFactory factory = builder.build(inputStream);

                    session = factory.openSession(true);

                }
//            }
            System.out.println((session == null )+"工厂 静态块"+"                2");
        }

    }

    public static SqlSession getSqlSession() {
        System.out.println((session == null )+"工厂 get方法"+"                1");
        return session;
    }



}
