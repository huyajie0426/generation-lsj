package com.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TbOrder {
    private Long uid;

    private String oUuid;

    private Long gUid;

    private BigDecimal oPayamount;

    private Date oInstime;

    private Long oReceiveinfo;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getoUuid() {
        return oUuid;
    }

    public void setoUuid(String oUuid) {
        this.oUuid = oUuid == null ? null : oUuid.trim();
    }

    public Long getgUid() {
        return gUid;
    }

    public void setgUid(Long gUid) {
        this.gUid = gUid;
    }

    public BigDecimal getoPayamount() {
        return oPayamount;
    }

    public void setoPayamount(BigDecimal oPayamount) {
        this.oPayamount = oPayamount;
    }

    public Date getoInstime() {
        return oInstime;
    }

    public void setoInstime(Date oInstime) {
        this.oInstime = oInstime;
    }

    public Long getoReceiveinfo() {
        return oReceiveinfo;
    }

    public void setoReceiveinfo(Long oReceiveinfo) {
        this.oReceiveinfo = oReceiveinfo;
    }
}