package com.pump.infocollection.domain.notice;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/21 0021.
 * 通知、公告
 */
public class Notice implements Serializable{

    private String content;             //内容
    private String date;                //日期

    public Notice() {
    }

    public Notice(String content, String date) {
        this.content = content;
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
