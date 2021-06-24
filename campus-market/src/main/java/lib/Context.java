package lib;

import controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class Context {
    public static ApplicationContext ctx;

    static {
        ctx = new ClassPathXmlApplicationContext("Configuration.xml");
    }

    public static void main(String[] args) {
        UserController controller = (UserController) ctx.getBean("userController");
        controller.service();


    }
}
