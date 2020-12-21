package org.itcase.tms.pojo;/*
 *ClassName:Node
 *UserName:小阎王丷
 *CreateTime:2020/11/13 11:23
 */

public class Node {
    private int id;
    private String node_name;
    private int node_state;
    private String node_remark;
    private int city_id;
    private int node_id;

    public Node() {
    }

    public Node(int id, String node_name, int node_state, String node_remark, int city_id, int node_id) {
        this.id = id;
        this.node_name = node_name;
        this.node_state = node_state;
        this.node_remark = node_remark;
        this.city_id = city_id;
        this.node_id = node_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNode_name() {
        return node_name;
    }

    public void setNode_name(String node_name) {
        this.node_name = node_name;
    }

    public int getNode_state() {
        return node_state;
    }

    public void setNode_state(int node_state) {
        this.node_state = node_state;
    }

    public String getNode_remark() {
        return node_remark;
    }

    public void setNode_remark(String node_remark) {
        this.node_remark = node_remark;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getNode_id() {
        return node_id;
    }

    public void setNode_id(int node_id) {
        this.node_id = node_id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", node_name='" + node_name + '\'' +
                ", node_state=" + node_state +
                ", node_remark='" + node_remark + '\'' +
                ", city_id=" + city_id +
                ", node_id=" + node_id +
                '}';
    }
}
