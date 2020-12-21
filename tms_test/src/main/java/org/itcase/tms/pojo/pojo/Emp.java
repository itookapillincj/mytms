package org.itcase.tms.pojo.pojo;/*
 *ClassName:Emp
 *UserName:小阎王丷
 *CreateTime:2020/9/24 13:56
 */

public class Emp {
    private int id;
    private String name;
    private String salary;
    private String sex;

    public Emp() {
    }

    public Emp(int id, String name, String salary, String sex) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.sex = sex;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
