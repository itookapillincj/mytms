package org.itcase.tms.pojo;/*
 *ClassName:Orgs
 *UserName:小阎王丷
 *CreateTime:2020/9/29 13:53
 */

public class Orgs {
    private int id;
    private String org_name;

    public Orgs() {
    }

    public Orgs(int id, String org_name) {
        this.id = id;
        this.org_name = org_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    @Override
    public String toString() {
        return "Orgs{" +
                "id=" + id +
                ", org_name='" + org_name + '\'' +
                '}';
    }
}
