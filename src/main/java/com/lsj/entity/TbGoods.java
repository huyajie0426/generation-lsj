package com.lsj.entity;

import java.math.BigDecimal;

public class TbGoods {
    private Long uid;

    private Integer sUid;

    private String gName;

    private BigDecimal gAmount;

    private BigDecimal gDiscount;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getsUid() {
        return sUid;
    }

    public void setsUid(Integer sUid) {
        this.sUid = sUid;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public BigDecimal getgAmount() {
        return gAmount;
    }

    public void setgAmount(BigDecimal gAmount) {
        this.gAmount = gAmount;
    }

    public BigDecimal getgDiscount() {
        return gDiscount;
    }

    public void setgDiscount(BigDecimal gDiscount) {
        this.gDiscount = gDiscount;
    }
}