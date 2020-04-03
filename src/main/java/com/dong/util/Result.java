package com.dong.util;

import java.util.List;

/**
 * @Author 董古华
 * @Create 2019/11/16 20:40
 * @see 返回前段数据工具类
 */
public class Result {
    private String Code;
    private String massage;
    private Object object;
    private List list;

    public Result (){}
    public Result(String code, String massage, Object object, List list) {
        this.Code = code;
        this.massage = massage;
        this.object = object;
        this.list = list;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        massage = massage;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
