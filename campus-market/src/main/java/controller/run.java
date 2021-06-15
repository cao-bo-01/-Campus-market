package controller;

import dao.MemberDao;
import dao.UserDao;
import domain.User;

public class  run {
    public static void main(String[] args) {

//        User user = new User();
//        user.setName("曹爸爸");
//        user.setAge(13);
//        user.setSex(1);

//        调用静态方法
//       int c = UserDao.insertUser();

//        UserDao.findUserAll();
//       传统方法
//        System.out.println(c);
//        MemberDao dao = new MemberDao();
//        Member me = new Member();
//        dao.addUser(user);

        MemberDao memberDao = new MemberDao();
        memberDao.findUserAll();

    }
}
