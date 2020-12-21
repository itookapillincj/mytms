package org.itcase.tms.util;/*
 *ClassName:MySQLConnection
 *UserName:小阎王丷
 *CreateTime:2020/9/23 11:00
 */

import java.sql.*;


public class MySQLConnection {
    public static Connection getConnection() {
        Connection conn = null;
        //MySQL数据库的URL
        String url = "jdbc:mysql://127.0.0.1:3306/db_tms?serverTimezone=UTC";
        String userName = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {

            conn = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public void close(Connection conn){
        try{
            if(conn!=null){
                conn.close();
            }
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    }
