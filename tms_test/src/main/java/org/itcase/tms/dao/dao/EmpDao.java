package org.itcase.tms.dao.dao;/*
 *ClassName:EmpDao
 *UserName:小阎王丷
 *CreateTime:2020/10/9 16:25
 */

import org.itcase.tms.pojo.pojo.Emp;
import org.itcase.tms.util.MySQLConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
    public List<Emp> getemps() {
        List<Emp> list = new ArrayList<Emp>();
        MySQLConnection jdbc = new MySQLConnection();
        Connection conn = jdbc.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from emp";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int empid = rs.getInt("id");
                String empname = rs.getString("name");
                String empsalary = rs.getString("salary");
                String empsex = rs.getString("sex");
                Emp e = new Emp(empid, empname, empsalary, empsex);
                list.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbc.close(conn);
        }
        return list;
    }

    public int insert(String name, String salary, String sex) {
        MySQLConnection jdbc = new MySQLConnection();
        Connection conn = jdbc.getConnection();
        String sql = "insert into emp(name,salary,sex) VALUES('" + name + "'," + salary + ",'" + sex + "')";
        Statement st = null;
        int rult = 0;
        try {
            st = conn.createStatement();
            rult = st.executeUpdate(sql);
        } catch (SQLException b) {
            b.printStackTrace();
        } finally {
            jdbc.close(conn);
        }
        return rult;
    }

    public int delect(int id) {
        MySQLConnection jdbc = new MySQLConnection();
        Connection conn = jdbc.getConnection();
        String sql = "delete from emp where id='" + id + "'";
        Statement st = null;
        int rult1 = 0;
        try {
            st = conn.createStatement();
            rult1 = st.executeUpdate(sql);
        } catch (SQLException b) {
            b.printStackTrace();
        } finally {
            jdbc.close(conn);
        }
        return rult1;
    }

    public int update(int id, String name, String salary, String sex) {
        MySQLConnection jdbc = new MySQLConnection();
        Connection conn = jdbc.getConnection();
        String sql = "update emp set name=?,salary=?,sex=? where id=?";
        PreparedStatement ps = null;
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,salary);
            ps.setString(3,sex);
            ps.setInt(4,id);
            count=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbc.close(conn);
        }
        return count;
    }
}
