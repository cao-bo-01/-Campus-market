import domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class test1 {
    @Autowired
    User user ;

    @Test
   public void  T1(){

        System.out.println(user);
    }
}
