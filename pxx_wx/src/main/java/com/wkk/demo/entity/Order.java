package com.wkk.demo.entity;

/***
 * 订单表
 */
public class Order {
    private String o_id;//订单号
    private String u_id;//微信号
    private String o_state;//订单状态
    private String o_date; //下单时间
    private Double o_price;//订单总价


    public String getO_id() {
        return o_id;
    }

    public void setO_id(String o_id) {
        this.o_id = o_id;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getO_state() {
        return o_state;
    }

    public void setO_state(String o_state) {
        this.o_state = o_state;
    }

    public String getO_date() {
        return o_date;
    }

    public void setO_date(String o_date) {
        this.o_date = o_date;
    }

    public Double getO_price() {
        return o_price;
    }

    public void setO_price(Double o_price) {
        this.o_price = o_price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "o_id='" + o_id + '\'' +
                ", u_id='" + u_id + '\'' +
                ", o_state='" + o_state + '\'' +
                ", o_date='" + o_date + '\'' +
                ", o_price=" + o_price +
                '}';
    }
}
