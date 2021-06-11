package dao;

//import sqlsession.Session;

import sqlsession.Session;

public class InsertDao {


    public void insertDao(){
        Session.getSession().insert("insertOne");
    }
}
