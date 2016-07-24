package com.pump.infocollection.domain.notice;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/21 0021.
 * 最近发展客户
 */
public class RecentDevelopCustomer implements Serializable {

    private String name;        //客户姓名
    private String dept;        //网点
    private String time;        //时间

    public RecentDevelopCustomer() {
    }

    public RecentDevelopCustomer(String name, String dept, String time) {
        this.name = name;
        this.dept = dept;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
