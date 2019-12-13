package com.hou.common;

import lombok.Data;
import lombok.ToString;

import java.util.List;

public class ResponseResult<T> {
    private Boolean flag;
    private String code;
    private T user;
    private List<T> userlist;

    public ResponseResult(Boolean flag, String code) {
        this.flag = flag;
        this.code = code;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getUser() {
        return user;
    }

    public void setUser(T user) {
        this.user = user;
    }

    public List<T> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<T> userlist) {
        this.userlist = userlist;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "flag=" + flag +
                ", code='" + code + '\'' +
                ", user=" + user +
                ", userlist=" + userlist +
                '}';
    }
}
