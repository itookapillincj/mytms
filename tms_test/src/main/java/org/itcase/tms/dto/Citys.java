package org.itcase.tms.dto;/*
 *ClassName:Citys
 *UserName:小阎王丷
 *CreateTime:2020/11/16 9:24
 */

public class Citys {
    private int id;
    private String city_name;

    public Citys() {
    }

    public Citys(int id, String city_name) {
        this.id = id;
        this.city_name = city_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    @Override
    public String toString() {
        return "Citys{" +
                "id=" + id +
                ", city_name='" + city_name + '\'' +
                '}';
    }
}
