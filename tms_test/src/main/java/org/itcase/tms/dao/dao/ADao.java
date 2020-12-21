package org.itcase.tms.dao.dao;/*
 *ClassName:ADao
 *UserName:小阎王丷
 *CreateTime:2020/9/25 10:06
 */

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.itcase.tms.pojo.pojo.A;
import org.itcase.tms.util.MySQLConnection;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;

public class ADao {
    public int addA(A a){
        int n=-1;
        MySQLConnection jdbc=new MySQLConnection();
        Connection conn=jdbc.getConnection();
        QueryRunner run=new QueryRunner();
        String sql="insert into a(id,name,age) values(?,?,?)";
        try {
           n= run.update(conn,sql,a.getId(),a.getName(),a.getAge());
            System.out.println(run);
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

public int addA1(A a){
    int n=-1;
    MySQLConnection jdbc=new MySQLConnection();
    Connection conn=jdbc.getConnection();
    QueryRunner run=new QueryRunner();
    String sql="insert into a(id,name,age) values(?,?,?)";
    try {
       ScalarHandler<BigInteger> scalarHandler=new ScalarHandler<BigInteger>();
        BigInteger id=run.insert(conn,sql,scalarHandler,a.getId(), a.getName(),a.getAge());
        System.out.println(id);
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
  public int delectA(int id){
        int n=-1;
      MySQLConnection jdbc=new MySQLConnection();
      Connection conn=jdbc.getConnection();
      QueryRunner run=new QueryRunner();
      String sql="delete from a where id=?";

      try {
          conn.setAutoCommit(false);//设置事务不会自动提交
          n= run.update(conn,sql,id);
//          if (n>=0){
//              throw new SQLException();
//          }
          conn.commit();//提交事务
      } catch (SQLException e) {
          e.printStackTrace();
          try {
              conn.rollback();//事务回滚
          } catch (SQLException e1) {
              e1.printStackTrace();
          }
      }finally {
          try {
              DbUtils.close(conn);
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
      return n;
  }
    public int updateA(A a){
        int n=-1;
        MySQLConnection jdbc=new MySQLConnection();
        Connection conn=jdbc.getConnection();
        QueryRunner run=new QueryRunner();
        String sql="update a set name=?,age=? where id=?";
        try {
            n= run.update(conn,sql,a.getName(),a.getAge(),a.getId());
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


