package com.lsj.entity;

import java.util.Date;

public class TbAdmin {
    private Long uid;

    private String adAccount;

    private String adPwd;

    private String adPhone;

    private Date adRegisttime;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getAdAccount() {
        return adAccount;
    }

    public void setAdAccount(String adAccount) {
        this.adAccount = adAccount == null ? null : adAccount.trim();
    }

    public String getAdPwd() {
        return adPwd;
    }

    public void setAdPwd(String adPwd) {
        this.adPwd = adPwd == null ? null : adPwd.trim();
    }

    public String getAdPhone() {
        return adPhone;
    }

    public void setAdPhone(String adPhone) {
        this.adPhone = adPhone == null ? null : adPhone.trim();
    }

    public Date getAdRegisttime() {
        return adRegisttime;
    }

    public void setAdRegisttime(Date adRegisttime) {
        this.adRegisttime = adRegisttime;
    }
}