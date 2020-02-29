package com.demo.entity;

import java.util.Date;

public class TbCategory {
    private Long uid;

    private String cName;

    private Date cInstime;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Date getcInstime() {
        return cInstime;
    }

    public void setcInstime(Date cInstime) {
        this.cInstime = cInstime;
    }
}