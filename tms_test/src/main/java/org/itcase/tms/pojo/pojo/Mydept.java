package org.itcase.tms.pojo.pojo;/*
 *ClassName:Mydept
 *UserName:小阎王丷
 *CreateTime:2020/9/26 20:01
 */

public class Mydept {
    private int id;
    private String name;
    private String address;
    private int age;
    private String sex;


   public Mydept() {
    }

    public Mydept(int id, String name, String address,int age,String sex) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age=age;
        this.sex=sex;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Mydept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
