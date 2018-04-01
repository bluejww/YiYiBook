package com.yiyibook.yiyibook.Model;

import java.io.Serializable;

/**
 * Created by jianweiwei on 2018/4/1.
 */

public class RequestInfo implements Serializable{
    public String getMobileMac() {
        return mobileMac;
    }

    public void setMobileMac(String mobileMac) {
        this.mobileMac = mobileMac;
    }

    private String mobileMac;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
}
