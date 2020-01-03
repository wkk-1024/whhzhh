package com.wkk.demo.entity;

/***
 * 库存表
 */
public class Stock {
    private String g_code;//商品条码
    private String g_name;//商品名称
    private Integer sellcount;//库存量
    private Double g_price;//商品采购价
    private String g_date;//上架时间
    private String g_outdate;//下架时间
    private String pic_url;//图片地址
    private Integer s_added;//是否上下架

    public Double getG_price() {
        return g_price;
    }

    public void setG_price(Double g_price) {
        this.g_price = g_price;
    }

    public Integer getS_added() {
        return s_added;
    }

    public void setS_added(Integer s_added) {
        this.s_added = s_added;
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

    public Integer getSellcount() {
        return sellcount;
    }

    public void setSellcount(Integer sellcount) {
        this.sellcount = sellcount;
    }

    public String getG_date() {
        return g_date;
    }

    public void setG_date(String g_date) {
        this.g_date = g_date;
    }

    public String getG_outdate() {
        return g_outdate;
    }

    public void setG_outdate(String g_outdate) {
        this.g_outdate = g_outdate;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "g_code='" + g_code + '\'' +
                ", g_name='" + g_name + '\'' +
                ", sellcount=" + sellcount +
                ", g_price=" + g_price +
                ", g_date='" + g_date + '\'' +
                ", g_outdate='" + g_outdate + '\'' +
                ", pic_url='" + pic_url + '\'' +
                ", s_added=" + s_added +
                '}';
    }
}
