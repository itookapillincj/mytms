package org.itcase.tms.dao;/*
 *ClassName:OrgsDao
 *UserName:小阎王丷
 *CreateTime:2020/9/29 13:54
 */

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.itcase.tms.pojo.Orgs;
import org.itcase.tms.util.MySQLConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OrgsDao {
    public List<Orgs> getOrgs(){
        Connection conn= MySQLConnection.getConnection();
        QueryRunner run =new QueryRunner();
        String sql ="select * from orgs";
        BeanListHandler<Orgs> beanListHandler=new BeanListHandler<>(Orgs.class);
        List<Orgs> list=null;
        try {
            list=run.query(conn,sql,beanListHandler);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
      }
}
