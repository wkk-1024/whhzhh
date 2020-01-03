package com.wkk.demo.entity;

public class admin {
    private Integer adminID;
    private String a_name;
    private String a_pwd;
    private String a_date;

    public Integer getAdminID() {
        return adminID;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_pwd() {
        return a_pwd;
    }

    public void setA_pwd(String a_pwd) {
        this.a_pwd = a_pwd;
    }

    public String getA_date() {
        return a_date;
    }

    public void setA_date(String a_date) {
        this.a_date = a_date;
    }

    @Override
    public String toString() {
        return "admin{" +
                "adminID=" + adminID +
                ", a_name='" + a_name + '\'' +
                ", a_pwd='" + a_pwd + '\'' +
                ", a_date='" + a_date + '\'' +
                '}';
    }
}
