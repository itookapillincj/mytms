package org.itcase.tms.dao;/*
 *ClassName:CityDao
 *UserName:小阎王丷
 *CreateTime:2020/10/19 15:21
 */

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.itcase.tms.dto.NodeDto;
import org.itcase.tms.pojo.City_info;
import org.itcase.tms.pojo.Page;
import org.itcase.tms.util.MySQLConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityDao {
    //查询城市信息
    public Page<City_info> getCity(int pageNo, int pageSize, String city_name) {
        List<City_info> list = null;
        Connection conn = MySQLConnection.getConnection();
        QueryRunner run = new QueryRunner();
        pageNo = (pageNo - 1) * pageSize;
        StringBuilder sql = new StringBuilder("SELECT a.id,a.city_state,a.city_code,a.city_name,b.org_name,c.d_center from city a,orgs b,dc c WHERE a.org_id=b.id and a.d_id=c.d_id ");
        StringBuilder sql1 = new StringBuilder("SELECT count(*) from city a,orgs b,dc c WHERE a.org_id=b.id and a.d_id=c.d_id ");
        if (city_name != null && !"".equals(city_name)) {
            sql.append(" and city_name ='");
            sql.append(city_name);
            sql.append("'");
            sql.append(" limit ");
            sql.append(pageNo);
            sql.append(",");
            sql.append(pageSize);
            sql1.append(" and city_name = '");
            sql1.append(city_name);
            sql1.append("'");
        } else {
            sql.append(" limit ");
            sql.append(pageNo);
            sql.append(",");
            sql.append(pageSize);
        }
        BeanListHandler<City_info> beanListHandler = new BeanListHandler<City_info>(City_info.class);
        ScalarHandler<Long> scalarHandler = new ScalarHandler<Long>();
        Page<City_info> page = new Page<>();
        try {
            list = run.query(conn, sql.toString(), beanListHandler);
            long total = run.query(conn, sql1.toString(), scalarHandler);
            page.setList(list);
            page.setTotalRecords(total);
            page.setPageSize(pageSize);
            page.setPageNo(pageNo);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return page;
    }
    //获取城市节点状态
    public List getNodestate(int city_id){
        Connection conn = MySQLConnection.getConnection();
        QueryRunner run = new QueryRunner();
        BeanListHandler<NodeDto> beanListHandler = new BeanListHandler<NodeDto>(NodeDto.class);
        String sql = "select node_state from node where  city_id=?";
        List<NodeDto> list = null;
        List<String> list1=new ArrayList<String>();
        try {
            list = run.query(conn, sql, beanListHandler, city_id);
            for (int i = 0; i <list.size() ; i++) {
                list1.add(i,list.get(i).getNode_state());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list1;
    }
    //作废节点
    public int cancellationCity(int city_id) {
        Connection conn = MySQLConnection.getConnection();
        QueryRunner run = new QueryRunner();
        String sql = "update city set city_state=0 where id=?";
        int n=0;
        try {
            n = run.update(conn, sql, city_id);
            System.out.println(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }   finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return n;
    }

    //修改城市信息
    public int updateCity(String cityName, String orgId, String cityCode, int id) {
        int n = 0;
        Connection conn = MySQLConnection.getConnection();
        QueryRunner run = new QueryRunner();
        String sql = "update city set city_name=?,org_id=?,city_code=? where id=?";
        try {
            n = run.update(conn, sql, cityName, orgId, cityCode, id);
            System.out.println(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return n;
    }

    //查看城市节点
    public List<NodeDto> getCityNode(int city_id) {
        Connection conn = MySQLConnection.getConnection();
        QueryRunner run = new QueryRunner();
        BeanListHandler<NodeDto> beanListHandler = new BeanListHandler<NodeDto>(NodeDto.class);
        String sql = "select a.node_type,b.node_name,b.node_state from nodes a, node b where a.id=b.node_id and city_id=?";
        List<NodeDto> list = null;
        try {
            list = run.query(conn, sql, beanListHandler, city_id);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
