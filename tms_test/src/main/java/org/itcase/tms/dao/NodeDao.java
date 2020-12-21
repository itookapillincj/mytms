package org.itcase.tms.dao;/*
 *ClassName:NodeDao
 *UserName:小阎王丷
 *CreateTime:2020/11/13 11:22
 */

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.itcase.tms.dto.Citys;
import org.itcase.tms.dto.NodesDto;
import org.itcase.tms.pojo.Nodes;
import org.itcase.tms.pojo.Page;
import org.itcase.tms.util.MySQLConnection;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NodeDao {
    //查询节点
    public List<Nodes> getNodes() {
        Connection conn = MySQLConnection.getConnection();
        QueryRunner run = new QueryRunner();
        String sql = "select * from nodes";
        BeanListHandler<Nodes> beanListHandler = new BeanListHandler<>(Nodes.class);
        List<Nodes> list = null;
        try {
            list = run.query(conn, sql, beanListHandler);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    //查询所有城市
    public List<Citys> getCitys() {
        Connection conn = MySQLConnection.getConnection();
        QueryRunner run = new QueryRunner();
        String sql = "select id,city_name from city";
        BeanListHandler<Citys> beanListHandler = new BeanListHandler<Citys>(Citys.class);
        List<Citys> list = null;
        try {
            list = run.query(conn, sql, beanListHandler);
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

    //根据城市名称，节点类型，节点名称查询节点
    public Page<NodesDto> getNode(int pageNo, int pageSize, String city_name, String node_type, String node_name) {
        List<NodesDto> list = new ArrayList<>();
        Page<NodesDto> page = new Page<>();
        Connection conn = MySQLConnection.getConnection();
        QueryRunner run = new QueryRunner();
        pageNo = (pageNo - 1) * pageSize;
        StringBuilder sql = new StringBuilder("SELECT a.id,a.node_state,b.city_code,b.city_name,c.org_name,d.d_center,e.node_type,a.node_name FROM node AS a INNER JOIN city AS b ON b.id=a.city_id,orgs AS c,dc AS d,nodes AS e WHERE c.id=b.org_id AND d.d_id=b.d_id AND e.id=a.node_id ");
        StringBuilder sql1 = new StringBuilder("SELECT COUNT(*) FROM node AS a INNER JOIN city AS b ON b.id=a.city_id,orgs AS c,dc AS d,nodes AS e WHERE c.id=b.org_id AND d.d_id=b.d_id AND e.id=a.node_id");
        if (city_name != null && !"".equals(city_name)) {
            sql.append(" and city_name ='");
            sql.append(city_name);
            sql.append("'");
            sql1.append(" and city_name = '");
            sql1.append(city_name);
            sql1.append("'");
        }
        if (node_type != null && !"".equals(node_type)) {
            sql.append(" and node_type ='");
            sql.append(node_type);
            sql.append("'");
            sql1.append(" and node_type = '");
            sql1.append(node_type);
            sql1.append("'");
        }
        if (node_name != null && !"".equals(node_name)) {
            sql.append(" and node_name ='");
            sql.append(node_name);
            sql.append("'");
            sql.append(" limit ");
            sql.append(pageNo);
            sql.append(",");
            sql.append(pageSize);
            sql1.append(" and node_name = '");
            sql1.append(node_name);
            sql1.append("'");
        } else {
            sql.append(" limit ");
            sql.append(pageNo);
            sql.append(",");
            sql.append(pageSize);
        }
        BeanListHandler<NodesDto> beanListHandler = new BeanListHandler<>(NodesDto.class);
        ScalarHandler<Long> scalarHandler = new ScalarHandler<Long>();
        try {
            list = run.query(conn, sql.toString(), beanListHandler);
            Long total = run.query(conn, sql1.toString(), scalarHandler);
            page.setList(list);
            page.setTotalRecords(total);
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
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

    //创建节点
    public int addNodeInfo(String node_name,String node_remark,int city_id,int node_id) {
        Connection conn=MySQLConnection.getConnection();
        QueryRunner run=new QueryRunner();
        String sql="INSERT INTO node(node_name,node_remark,city_id,node_id) VALUES(?,?,?,?)";
        ScalarHandler<BigInteger> scalarHandler=new ScalarHandler<BigInteger>();
        BigInteger id=new BigInteger("0");
        try {
            id=run.insert(conn,sql,scalarHandler,node_name,node_remark,city_id,node_id);
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
    //根据城市名称查询城市id
    public int getCityId(String city_name){
        Connection conn=MySQLConnection.getConnection();
        QueryRunner run=new QueryRunner();
        String sql="select id from city where city_name=?";
        ScalarHandler<Integer> scalarHandler=new ScalarHandler<Integer>();
        int id=0;
        try {
           id= run.query(conn,sql,scalarHandler,city_name);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return id;
    }
    //根据节点类型查找节点id
    public int getNodeId(String node_type){
        Connection conn=MySQLConnection.getConnection();
        QueryRunner run=new QueryRunner();
        String sql="select id from nodes where node_type=?";
        ScalarHandler<Integer> scalarHandler=new ScalarHandler<Integer>();
        int id=0;
        try {
            id= run.query(conn,sql,scalarHandler,node_type);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return id;
    }
}