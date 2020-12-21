package org.itcase.tms.dto;/*
 *ClassName:nodeDto
 *UserName:小阎王丷
 *CreateTime:2020/11/16 9:15
 */

public class NodeDto {
    private String node_type;
    private String node_name;
    private String node_state;

    public NodeDto() {
    }

    public NodeDto(String node_type, String node_name, String node_state) {
        this.node_type = node_type;
        this.node_name = node_name;
        this.node_state = node_state;
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

    public String getNode_state() {
        return node_state;
    }

    public void setNode_state(String node_state) {
        this.node_state = node_state;
    }

    @Override
    public String toString() {
        return "NodeDto{" +
                "node_type='" + node_type + '\'' +
                ", node_name='" + node_name + '\'' +
                ", node_state='" + node_state + '\'' +
                '}';
    }
}
