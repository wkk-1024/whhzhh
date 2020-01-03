package com.wkk.demo.entity;

/***
 * 用户实体
 */
public class Userinfo {
    private String u_id;//微信号
    private String u_name;//微信昵称
    private String u_pic;//微信头像
    private String u_date;//微信最近登录时间
    private String u_addess;//收货地址
    private Integer u_phone;//手机号

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pic() {
        return u_pic;
    }

    public void setU_pic(String u_pic) {
        this.u_pic = u_pic;
    }

    public String getU_date() {
        return u_date;
    }

    public void setU_date(String u_date) {
        this.u_date = u_date;
    }

    public String getU_addess() {
        return u_addess;
    }

    public void setU_addess(String u_addess) {
        this.u_addess = u_addess;
    }

    public Integer getU_phone() {
        return u_phone;
    }

    public void setU_phone(Integer u_phone) {
        this.u_phone = u_phone;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "u_id='" + u_id + '\'' +
                ", u_name='" + u_name + '\'' +
                ", u_pic='" + u_pic + '\'' +
                ", u_date='" + u_date + '\'' +
                ", u_addess='" + u_addess + '\'' +
                ", u_phone=" + u_phone +
                '}';
    }
}
