package org.itcase.tms.dao;/*
 *ClassName:TmsCityDao
 *UserName:小阎王丷
 *CreateTime:2020/9/28 9:44
 */

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.itcase.tms.pojo.pojo.User;
import org.itcase.tms.util.MySQLConnection;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public class TmsCityDao {
    //新建城市
    public int AddCity(String cityName,String cityCode,String orgId) {
         Connection conn=MySQLConnection.getConnection();
         QueryRunner run =new QueryRunner();
        ScalarHandler<BigInteger> scalarHandler=new ScalarHandler<BigInteger>();
        String sql="insert into city(city_name,city_code,org_id) values(?,?,?)";
        BigInteger id=new BigInteger("0");
        try {
           id= run.insert(conn,sql,scalarHandler,cityName,cityCode,orgId);
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
}
