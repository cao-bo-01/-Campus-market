package com.market.Test.dao;


import com.market.Test.Session;

public class InsertDao {


    public void insertDao(){
        Session.getSession().insert("insertOne");
    }
}
