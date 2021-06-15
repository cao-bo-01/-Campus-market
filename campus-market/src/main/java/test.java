import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class test {

    public static void main(String[] args) {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.xml");

        SqlSessionFactory factory = builder.build(inputStream);

        SqlSession session =  factory.openSession(true);

        System.out.println(session == null);

    }
}
