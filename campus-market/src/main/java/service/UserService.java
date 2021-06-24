package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//    @Autowired
//    UserDao dao;

    public void service() {
        System.out.println("service + 够哦");
//        dao.add();
    }
}
