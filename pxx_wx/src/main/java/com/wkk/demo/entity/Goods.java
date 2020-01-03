package com.wkk.demo.entity;

/***
 * 商品表
 */
public class Goods {
    private Integer g_id;   //商品id
    private String g_code;  //商品条码
    private String g_name;  //商品名字
    private String g_kind; //商品种类id
    private String g_unit;  //商品单位
    private Double g_price; //商品价格
    private int sellcount; //销售量
    private String Pic_Url; //图片id
    private String p_date; //上架时间
    private String g_Intro; //商品介绍
    private Integer s_added; //是否上下架

    public String getG_Intro() {
        return g_Intro;
    }

    public void setG_Intro(String g_Intro) {
        this.g_Intro = g_Intro;
    }

    public Integer getS_added() {
        return s_added;
    }

    public void setS_added(Integer s_added) {
        this.s_added = s_added;
    }

    public Goods() {
    }

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
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

    public String getG_kind() {
        return g_kind;
    }

    public void setG_kind(String g_kind) {
        this.g_kind = g_kind;
    }

    public String getG_unit() {
        return g_unit;
    }

    public void setG_unit(String g_unit) {
        this.g_unit = g_unit;
    }

    public Double getG_price() {
        return g_price;
    }

    public void setG_price(Double g_price) {
        this.g_price = g_price;
    }

    public int getSellcount() {
        return sellcount;
    }

    public void setSellcount(int sellcount) {
        this.sellcount = sellcount;
    }

    public String getPic_Url() {
        return Pic_Url;
    }

    public void setPic_Url(String pic_Url) {
        Pic_Url = pic_Url;
    }

    public String getP_date() {
        return p_date;
    }

    public void setP_date(String p_date) {
        this.p_date = p_date;
    }
}
