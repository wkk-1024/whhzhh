package com.wkk.demo.entity;

/***
 * 分类表
 */
public class Sort {
    private Integer sort_id;//种类id
    private String g_kind;//种类名
    private String sort_details;//种类介绍

    public Integer getSort_id() {
        return sort_id;
    }

    public void setSort_id(Integer sort_id) {
        this.sort_id = sort_id;
    }

    public String getG_kind() {
        return g_kind;
    }

    public void setG_kind(String g_kind) {
        this.g_kind = g_kind;
    }

    public String getSort_details() {
        return sort_details;
    }

    public void setSort_details(String sort_details) {
        this.sort_details = sort_details;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "sort_id=" + sort_id +
                ", g_kind='" + g_kind + '\'' +
                ", sort_details='" + sort_details + '\'' +
                '}';
    }
}
