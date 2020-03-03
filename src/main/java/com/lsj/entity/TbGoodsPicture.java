package com.lsj.entity;

import java.util.Date;

public class TbGoodsPicture {
    private Long uid;

    private Long gUid;

    private String gpUrl;

    private Date gpInstime;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getgUid() {
        return gUid;
    }

    public void setgUid(Long gUid) {
        this.gUid = gUid;
    }

    public String getGpUrl() {
        return gpUrl;
    }

    public void setGpUrl(String gpUrl) {
        this.gpUrl = gpUrl == null ? null : gpUrl.trim();
    }

    public Date getGpInstime() {
        return gpInstime;
    }

    public void setGpInstime(Date gpInstime) {
        this.gpInstime = gpInstime;
    }
}