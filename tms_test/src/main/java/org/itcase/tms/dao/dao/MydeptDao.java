package org.itcase.tms.dao.dao;/*
 *ClassName:MydeptDao
 *UserName:小阎王丷
 *CreateTime:2020/9/26 20:20
 */

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.itcase.tms.pojo.pojo.Mydept;
import org.itcase.tms.util.MySQLConnection;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MydeptDao {
    //插入数据
    int n=0;
    public int addMydept(Mydept mydept){
        MySQLConnection jdbc=new MySQLConnection();
        Connection conn=jdbc.getConnection();
        QueryRunner run=new QueryRunner();
        String sql="insert into mydept(name,address,age,sex) values(?,?,?,?)";
        try {
            conn.setAutoCommit(false);//设置事务不会自动提交
            ScalarHandler<BigInteger> ScalarHandler=new ScalarHandler<BigInteger>();
            BigInteger id=run.insert(conn,sql,ScalarHandler,mydept.getName(),mydept.getAddress(),mydept.getAge(),mydept.getSex());
            System.out.println(id);
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
 //删除操作
    public int deleteMydept(int id){
        int n=-1;
        MySQLConnection jdbc=new MySQLConnection();
        Connection conn=jdbc.getConnection();
        QueryRunner run=new QueryRunner();
        String sql="delete from mydept where id=?";
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
    //修改操作
    public int updateMydept(Mydept mydept){
        int n=-1;
        MySQLConnection jdbc=new MySQLConnection();
        Connection conn=jdbc.getConnection();
        QueryRunner run=new QueryRunner();
        String sql="update mydept set name=?,address=?,age=?,sex=? where id=?";
        try {
            conn.setAutoCommit(false);//设置事务不会自动提交
            n= run.update(conn,sql,mydept.getName(),mydept.getAddress(),mydept.getAge(),mydept.getSex(),mydept.getId());
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
    //根据id查询
   public List<Mydept> selectMydept(int id){
       List<Mydept> list=new ArrayList<Mydept>();
       MySQLConnection jdbc=new MySQLConnection();
       Connection conn=jdbc.getConnection();
       QueryRunner run=new QueryRunner();
       String sql="select * from mydept where id=?";
       try {
           conn.setAutoCommit(false);//设置事务不会自动提交
           BeanHandler<Mydept> beanHandler=new BeanHandler<Mydept>(Mydept.class);
           list.add(run.query(conn,sql,beanHandler,id));
           conn.commit();
       } catch (SQLException e) {
           e.printStackTrace();
           try {
               conn.rollback();
           } catch (SQLException e1) {
               e1.printStackTrace();
           }
       }finally {
           jdbc.close(conn);
       }
       return list;
   }
    public List<Mydept> selectMydept1(int id, String name, String address,int age,String sex){
        List<Mydept> list=new ArrayList<Mydept>();
        MySQLConnection jdbc=new MySQLConnection();
        Connection conn=jdbc.getConnection();
        QueryRunner run=new QueryRunner();
        StringBuilder sql=new StringBuilder("select * from mydept where 1=1");
        if (id>0){
            sql.append(" and id=");
            sql.append(id);
            System.out.println(sql);
        }
        if (name!=null &&!"".equals(name)){
            sql.append(" and name=");
            sql.append(name);
            System.out.println(sql);
        }
        if (address!=null&&!"".equals(address)){
            sql.append(" and address=");
            sql.append(address);
            System.out.println(sql);
        }
        if (age>0){
            sql.append(" and age=");
            sql.append(age);
            System.out.println(sql);
        }
        if (sex!=null&&!"".equals(sex)){
            sql.append(" and sex=");
            sql.append(sex);
           // System.out.println(sql);
        }
        try {
            conn.setAutoCommit(false);//设置事务不会自动提交
            BeanHandler<Mydept> beanHandler=new BeanHandler<Mydept>(Mydept.class);
            list.add(run.query(conn, sql.toString(), beanHandler, id, name, address, age, sex));
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}

