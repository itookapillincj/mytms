package org.itcase.tms.pojo.pojo;/*
 *ClassName:A
 *UserName:小阎王丷
 *CreateTime:2020/9/25 10:04
 */

public class A {
    private int id;
    private String name;
    private String age;

    public A() {
    }

    public A(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public A(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
