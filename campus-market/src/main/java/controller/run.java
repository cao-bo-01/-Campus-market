package controller;

import dao.MemberDao;
import dao.UserDao;
import domain.Member;
import domain.User;

public class  run {
    public static void main(String[] args) {

//
        User user = new User();
        user.setName("曹爸爸");
        user.setAge(13);
        user.setSex(1);
//
//       int c = UserDao.insertUser(user);
//        System.out.println(c);
        MemberDao dao = new MemberDao();
        Member me = new Member();
        dao.addUser(user);

    }
}


//    INSERT INTO user (
//        name, age, sex
//        ) VALUES (
//        #{name},
//        #{age},
//        #{sex}
//        )