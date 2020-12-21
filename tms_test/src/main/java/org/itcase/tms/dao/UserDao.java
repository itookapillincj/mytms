package org.itcase.tms.dao;/*
 *ClassName:UserDao
 *UserName:小阎王丷
 *CreateTime:2020/9/23 11:31
 */


import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.itcase.tms.pojo.Account;

import org.itcase.tms.util.MySQLConnection;

import java.math.BigInteger;
import java.sql.*;

public class UserDao {
    //查询用户
public Account checkAccount(int id,String email,String password){
    StringBuilder sql=new StringBuilder("select id,name,email,password,confirmed_and_active from account where 1=1");
            QueryRunner run=new QueryRunner();
            Connection conn=MySQLConnection.getConnection();
            BeanHandler<Account> beanHandler=new BeanHandler<Account>(Account.class);
    if (email==null||"".equals(email.trim())){
            sql.append(" and id= ");
            sql.append(id);
            sql.append(" and password= ");
            sql.append(password);
        }else {
            sql.append(" and email= '");
            sql.append(email);
            sql.append("'");
            sql.append(" and password= '");
            sql.append(password);
            sql.append("'");
        }
        Account account=null;
    try {
        account= run.query(conn,sql.toString(),beanHandler);
    } catch (SQLException e) {
        e.printStackTrace();
    }finally {
        try {
            DbUtils.close(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return account;
}
     //添加用户
    public int addAccount(String name,String email,String password,String code){
       int n=0;
       Connection conn=MySQLConnection.getConnection();
       QueryRunner run =new QueryRunner();
       String sql="insert into account(name,email,password,code) values(?,?,?,?)";
        ScalarHandler<BigInteger> scalarHandler =new ScalarHandler<>();
        BigInteger id=new BigInteger("0");
        try {
            id=run.insert(conn,sql,scalarHandler,name,email,password,code);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return id.intValue();
    }
    //修改状态码
    /*
     * param：email邮件
     */
    public int updatestate(String email){
        int n=0;
        Connection conn=MySQLConnection.getConnection();
        QueryRunner run=new QueryRunner();
        String sql="update account set confirmed_and_active=1 where email= ?";
        try {
            n=run.update(conn,sql,email);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return n;
    }
}
