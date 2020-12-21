package org.itcase.tms.pojo.pojo;/*
 *ClassName:Foot
 *UserName:小阎王丷
 *CreateTime:2020/9/24 13:53
 */

import java.util.Date;

public class Foot {
    private int id;
    private String name;
    private String company;
    private float price;
    private Date produce_time;
    private int validity_time;
    private String address;

    public Foot() {
    }

    public Foot(int id, String name, String company, float price, Date produce_time, int validity_time, String address) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = price;
        this.produce_time = produce_time;
        this.validity_time = validity_time;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getProduce_time() {
        return produce_time;
    }

    public void setProduce_time(Date produce_time) {
        this.produce_time = produce_time;
    }

    public int getValidity_time() {
        return validity_time;
    }

    public void setValidity_time(int validity_time) {
        this.validity_time = validity_time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Foot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", produce_time=" + produce_time +
                ", validity_time=" + validity_time +
                ", address='" + address + '\'' +
                '}';
    }
}
