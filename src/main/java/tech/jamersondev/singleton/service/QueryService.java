package tech.jamersondev.singleton.service;

import tech.jamersondev.singleton.model.Connection;
import tech.jamersondev.singleton.model.ConnectionPool;

public class QueryService {

    public static void Query1(){
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = connectionPool.getConnection();
        if(connection != null){
            connection.query("SELECT * FROM Q1");
        }
    }

    public static void Query2(){
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = connectionPool.getConnection();
        if(connection != null){
            connection.query("SELECT * FROM Q2");
        }
    }

    public static void Query3(){
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = connectionPool.getConnection();
        if(connection != null){
            connection.query("SELECT * FROM Q3");
        }
    }
}
