package com.lsj.entity;

import java.util.Date;

public class TbBrand {
    private Long uid;

    private String bName;

    private Date bInstime;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public Date getbInstime() {
        return bInstime;
    }

    public void setbInstime(Date bInstime) {
        this.bInstime = bInstime;
    }
}