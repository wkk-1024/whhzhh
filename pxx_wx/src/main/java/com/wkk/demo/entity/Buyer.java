package com.wkk.demo.entity;

/***
 * 采购表
 */
public class Buyer {
    private String g_code;//商品条码
    private String g_name;//商品名称
    private String pic_url;//商品图片地址
    private Integer sellcount;//数量
    private Double g_price;//采购价格

    public Integer getSellcount() {
        return sellcount;
    }

    public void setSellcount(Integer sellcount) {
        this.sellcount = sellcount;
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

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public Double getG_price() {
        return g_price;
    }

    public void setG_price(Double g_price) {
        this.g_price = g_price;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "g_code='" + g_code + '\'' +
                ", g_name='" + g_name + '\'' +
                ", pic_url='" + pic_url + '\'' +
                ", sellcount=" + sellcount +
                ", g_price=" + g_price +
                '}';
    }
}
