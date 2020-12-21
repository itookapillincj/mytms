package org.itcase.tms.dao.dao;/*
 *ClassName:Client
 *UserName:小阎王丷
 *CreateTime:2020/10/26 15:23
 */

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.itcase.tms.pojo.City_info;
import org.itcase.tms.pojo.Page;
import org.itcase.tms.util.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PageDao {
    public static Page findCityInfo(int pageNo, int pageSize,String city_name){
        Connection conn= MySQLConnection.getConnection();
        String sql="SELECT a.id,a.city_state,a.city_code,a.city_name,b.org_name,c.d_center from city a,orgs b,dc c WHERE a.org_id=b.id and a.d_id=c.d_id and city_name=? LIMIT ?,?";

        Page page=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;
        City_info cityInfo=null;
        List<City_info> list=new ArrayList<City_info>();
        try {
            pstm=conn.prepareStatement(sql);
            pstm.setString(1,city_name);
            pstm.setInt(2, (pageNo-1)*pageSize);
            pstm.setInt(3, pageSize);
            rs=pstm.executeQuery();
            while(rs.next()){
                City_info city_info=new City_info();
                city_info.setId(rs.getInt("id"));
                city_info.setCity_state(rs.getInt("city_state"));
                city_info.setCity_code(rs.getString("city_code"));
                city_info.setCity_name(rs.getString("city_name"));
                city_info.setOrg_name(rs.getString("Org_name"));
                city_info.setD_center(rs.getString("D_center"));
                list.add(city_info);
            }
            ResultSet rs2=pstm.executeQuery("SELECT  count(*) from city a,orgs b,dc c WHERE a.org_id=b.id and a.d_id=c.d_id and city_name=?");
            int total=0;
            if(rs2.next()){
                total=rs2.getInt(1);
            }
            page=new Page();
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
            page.setTotalRecords(total);
            page.setList(list);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return page;
    }
}
