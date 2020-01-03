package com.wkk.demo.entity;

/***
 * 订单详情表
 */
public class Order_details {

    private Integer oid;//订单详情号
    private String o_id;//订单号
    private String u_id;//微信号
    private String g_code;//商品条码
    private String g_name;//商品名称
    private Integer o_count;//数量
    private String o_state;//订单状态
    private String o_date;//下单时间

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

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

    public String getG_code() {
        return g_code;
    }

    public void setG_code(String g_code) {
        this.g_code = g_code;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public Integer getO_count() {
        return o_count;
    }

    public void setO_count(Integer o_count) {
        this.o_count = o_count;
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

    @Override
    public String toString() {
        return "Order_details{" +
                "oid=" + oid +
                ", o_id='" + o_id + '\'' +
                ", u_id='" + u_id + '\'' +
                ", g_code='" + g_code + '\'' +
                ", g_name='" + g_name + '\'' +
                ", o_count=" + o_count +
                ", o_state='" + o_state + '\'' +
                ", o_date='" + o_date + '\'' +
                '}';
    }
}
