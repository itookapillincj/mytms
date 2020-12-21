package org.itcase.tms.pojo;/*
 *ClassName:City_info
 *UserName:小阎王丷
 *CreateTime:2020/10/19 15:14
 */

public class City_info {
    private int id;
    private int city_state;
    private String city_code;
    private String city_name;
    private String org_name;
    private String d_center;

    public City_info() {
    }

    public City_info( int id,int city_state, String city_code, String city_name, String org_name, String d_center) {
        this.id=id;
        this.city_state = city_state;
        this.city_code = city_code;
        this.city_name = city_name;
        this.org_name = org_name;
        this.d_center = d_center;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCity_state() {
        return city_state;
    }

    public void setCity_state(int city_state) {
        this.city_state = city_state;
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

    @Override
    public String toString() {
        return "City_info{" +
                "id="+id+
                "city_state=" + city_state +'\'' +
                ", city_code='" + city_code + '\'' +
                ", city_name='" + city_name + '\'' +
                ", org_name='" + org_name + '\'' +
                ", d_center='" + d_center + '\'' +
                '}';
    }
}
