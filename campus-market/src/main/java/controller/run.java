package controller;

import dao.MemberDao;
import domain.Member;

public class run {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao();
        Member me = new Member();
        dao.insert(me);
    }
}
