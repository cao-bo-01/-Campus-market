package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class run {

    @Autowired
    UserController userController;
    public static void main(String[] args)  {


       run run = new run();
      run.userController.service();
    }
}
