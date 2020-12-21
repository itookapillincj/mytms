package org.itcase.tms.pojo;/*
 *ClassName:Account
 *UserName:小阎王丷
 *CreateTime:2020/10/10 10:07
 */


public class Account {
    private int id;
    private String name;
    private String email;//邮箱
    private String phone_number;
    private String password_hash;
    private String password;
    private int confirmed_and_active;//状态码
    private String code;//激活码
    public Account() {
    }

    public Account(int id, String name, String email, String phone_number, String password_hash, String password, int confirmed_and_active,String code) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.password_hash = password_hash;
        this.password = password;
        this.confirmed_and_active = confirmed_and_active;
        this.code=code;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getConfirmed_and_active() {
        return confirmed_and_active;
    }

    public void setConfirmed_and_active(int confirmed_and_active) {
        this.confirmed_and_active = confirmed_and_active;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", password_hash='" + password_hash + '\'' +
                ", password='" + password + '\'' +
                ", confirmed_and_active=" + confirmed_and_active +
                ", code='" + code + '\'' +
                '}';
    }
}
