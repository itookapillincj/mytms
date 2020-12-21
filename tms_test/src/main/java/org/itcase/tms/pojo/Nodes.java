package org.itcase.tms.pojo;/*
 *ClassName:Nodes
 *UserName:小阎王丷
 *CreateTime:2020/11/15 15:08
 */

public class Nodes {
    private int id;
    private String node_type;
    private String node_code;

    public Nodes() {
    }

    public Nodes(int id, String node_type, String node_code) {
        this.id = id;
        this.node_type = node_type;
        this.node_code = node_code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNode_type() {
        return node_type;
    }

    public void setNode_type(String node_type) {
        this.node_type = node_type;
    }

    public String getNode_code() {
        return node_code;
    }

    public void setNode_code(String node_code) {
        this.node_code = node_code;
    }

    @Override
    public String toString() {
        return "Nodes{" +
                "id=" + id +
                ", node_type='" + node_type + '\'' +
                ", node_code='" + node_code + '\'' +
                '}';
    }
}
