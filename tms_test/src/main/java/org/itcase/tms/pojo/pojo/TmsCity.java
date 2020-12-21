package org.itcase.tms.pojo.pojo;/*
 *ClassName:TmsCity
 *UserName:小阎王丷
 *CreateTime:2020/9/28 9:38
 */

public class TmsCity {
    private int city_id;
    private String city_state;//状态
    private String city_code;//城市代码
    private String city_name;//城市名称
    private String org_name;//机构名称
    private String logistics_center;//配送中心名称

    public TmsCity() {
    }

    public TmsCity(int city_id,String city_state, String city_code, String city_name, String org_name, String logistics_center) {
        this.city_id=city_id;
        this.city_state = city_state;
        this.city_code = city_code;
        this.city_name = city_name;
        this.org_name = org_name;
        this.logistics_center = logistics_center;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_state() {
        return city_state;
    }

    public void setCity_state(String city_state) {
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

    public String getLogistics_center() {
        return logistics_center;
    }

    public void setLogistics_center(String logistics_center) {
        this.logistics_center = logistics_center;
    }

    @Override
    public String toString() {
        return "TmsCity{" +
                "city_id=" + city_id +
                ", city_state='" + city_state + '\'' +
                ", city_code='" + city_code + '\'' +
                ", city_name='" + city_name + '\'' +
                ", org_name='" + org_name + '\'' +
                ", logistics_center='" + logistics_center + '\'' +
                '}';
    }
}
