package org.itcase.tms.dto;/*
 *ClassName:NodesDto
 *UserName:小阎王丷
 *CreateTime:2020/11/18 21:05
 */

public class NodesDto {
    private int id;
    private String node_state;
    private String city_code;
    private String city_name;
    private String org_name;
    private String d_center;
    private String node_type;
    private String node_name;

    public NodesDto() {
    }

    public NodesDto(int id,String node_state,String city_code, String city_name, String org_name, String d_center, String node_type, String node_name) {
        this.id = id;
        this.node_state=node_state;
        this.city_code = city_code;
        this.city_name = city_name;
        this.org_name = org_name;
        this.d_center = d_center;
        this.node_type = node_type;
        this.node_name = node_name;
    }

    public String getNode_state() {
        return node_state;
    }

    public void setNode_state(String node_state) {
        this.node_state = node_state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getD_center() {
        return d_center;
    }

    public void setD_center(String d_center) {
        this.d_center = d_center;
    }

    public String getNode_type() {
        return node_type;
    }

    public void setNode_type(String node_type) {
        this.node_type = node_type;
    }

    public String getNode_name() {
        return node_name;
    }

    public void setNode_name(String node_name) {
        this.node_name = node_name;
    }

    @Override
    public String toString() {
        return "NodesDto{" +
                "id=" + id +
                ", city_code='" + city_code + '\'' +
                ", city_name='" + city_name + '\'' +
                ", org_name='" + org_name + '\'' +
                ", d_center='" + d_center + '\'' +
                ", node_type='" + node_type + '\'' +
                ", node_name='" + node_name + '\'' +
                '}';
    }
}
