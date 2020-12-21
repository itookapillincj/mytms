package org.itcase.tms.pojo;/*
 *ClassName:City
 *UserName:小阎王丷
 *CreateTime:2020/10/5 10:00
 */

public class City {
    private int id;
    private String cityName;
    private String orgId;
    private String cityCode;

    public City() {
    }

    public City(int id, String cityName, String orgId, String cityCode) {
        this.id = id;
        this.cityName = cityName;
        this.orgId = orgId;
        this.cityCode = cityCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", orgId='" + orgId + '\'' +
                ", cityCode='" + cityCode + '\'' +
                '}';
    }
}
