package com.pump.infocollection.domain.notice;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/21 0021.
 * 最近拜访客户
 */
public class RecentVisitCustomer implements Serializable {

    private String name;                //姓名
    private String date;                //日期
    private String weekday;             //星期
    private String phoneNumber;         //联系方式
    private String visitor;             //拜访人

    public RecentVisitCustomer() {
    }

    public RecentVisitCustomer(String name, String date, String weekday, String phoneNumber, String visitor) {
        this.name = name;
        this.date = date;
        this.weekday = weekday;
        this.phoneNumber = phoneNumber;
        this.visitor = visitor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }
}
