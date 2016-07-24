package com.pump.infocollection.domain;

/**
 * Created by Administrator on 2016/7/17 0017.
 * 表单类型
 */
public class SheetType {

    private String typeName;
    private int type;

    public SheetType() {
    }

    public SheetType(String typeName, int type) {
        this.typeName = typeName;
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
