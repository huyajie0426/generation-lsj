package com.lsj.entity;

import java.util.Date;

public class TbStock {
    private Long uid;

    private Long cUid;

    private Long bUid;

    private String sName;

    private Long sCount;

    private Integer sOnsale;

    private Date sInstime;

    private Date sUpttime;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getcUid() {
        return cUid;
    }

    public void setcUid(Long cUid) {
        this.cUid = cUid;
    }

    public Long getbUid() {
        return bUid;
    }

    public void setbUid(Long bUid) {
        this.bUid = bUid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Long getsCount() {
        return sCount;
    }

    public void setsCount(Long sCount) {
        this.sCount = sCount;
    }

    public Integer getsOnsale() {
        return sOnsale;
    }

    public void setsOnsale(Integer sOnsale) {
        this.sOnsale = sOnsale;
    }

    public Date getsInstime() {
        return sInstime;
    }

    public void setsInstime(Date sInstime) {
        this.sInstime = sInstime;
    }

    public Date getsUpttime() {
        return sUpttime;
    }

    public void setsUpttime(Date sUpttime) {
        this.sUpttime = sUpttime;
    }
}