package sqlsession;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Session {

    private static SqlSession session;
    public static  SqlSession getSession(){
        if(session == null){
//           创建工人  创建工厂 创建对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("property.xml");
            System.out.println(inputStream);
            SqlSessionFactory factory = builder.build(inputStream);
//            自动提交 true
            session = factory.openSession(true);

        }
        return session;
    }
}
