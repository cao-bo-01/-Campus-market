package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.UserService;

@Controller
public class UserController {

    @Autowired
UserService userService;

    public void service(){
        System.out.println("service 执行了！");
         userService.service();
    }


}
