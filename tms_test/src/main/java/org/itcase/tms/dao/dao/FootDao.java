package org.itcase.tms.dao.dao;/*
 *ClassName:FootDao
 *UserName:小阎王丷
 *CreateTime:2020/9/24 13:51
 */

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.itcase.tms.pojo.pojo.Foot;
import org.itcase.tms.util.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class FootDao {
    public List<Foot> select(int id, String name, String company, float price, String produce_time, int validity_time, String address){
      List<Foot> list=new ArrayList<>();
        MySQLConnection jdbc=new MySQLConnection();
        Connection conn=jdbc.getConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        StringBuilder sql=new StringBuilder("select * from foot where 1=1 ");
          if (id>0){
              sql.append("and id =");
              sql.append(id);
              System.out.println(sql);
          }
          if (name!=null&&!"".equals(name)){
              sql.append("and name=");
              sql.append(name);
              System.out.println(sql);
          }
          if (company!=null&&!"".equals(company)){
              sql.append("and company=");
              sql.append(company);
              System.out.println(sql);
          }
        try {
            ps=conn.prepareStatement(sql.toString());
            rs=ps.executeQuery();
            while (rs.next()){
              int id1=rs.getInt("id");
              String name1=rs.getString("name");
              String company1=rs.getString("company");
              float price1=  rs.getFloat("price");
              Date produce_time1= rs.getDate("produce_time");
              int validity_time1=  rs.getInt("validity_time");
              String address1=  rs.getString("address");
                Foot f=new Foot(id1,name1,company1,price1,produce_time1,validity_time1,address1);
                list.add(f);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Foot> select1(int id, String name, String company, float price, String produce_time, int validity_time, String address){
        String sq="select * from foot ";
        StringBuilder sql=new StringBuilder(sq);
        QueryRunner run=new QueryRunner();
        List<Foot> list =null;
        try {
            list=run.query(MySQLConnection.getConnection(),sql.toString(),new BeanListHandler<Foot>(Foot.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
