package com.lsj.entity;

public class TbAddress {
    private Long uid;

    private Long uUid;

    private String addRecipient;

    private String addPhone;

    private String addProvince;

    private String addCity;

    private String addCountry;

    private String addInfo;

    private Integer addDefault;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getuUid() {
        return uUid;
    }

    public void setuUid(Long uUid) {
        this.uUid = uUid;
    }

    public String getAddRecipient() {
        return addRecipient;
    }

    public void setAddRecipient(String addRecipient) {
        this.addRecipient = addRecipient == null ? null : addRecipient.trim();
    }

    public String getAddPhone() {
        return addPhone;
    }

    public void setAddPhone(String addPhone) {
        this.addPhone = addPhone == null ? null : addPhone.trim();
    }

    public String getAddProvince() {
        return addProvince;
    }

    public void setAddProvince(String addProvince) {
        this.addProvince = addProvince == null ? null : addProvince.trim();
    }

    public String getAddCity() {
        return addCity;
    }

    public void setAddCity(String addCity) {
        this.addCity = addCity == null ? null : addCity.trim();
    }

    public String getAddCountry() {
        return addCountry;
    }

    public void setAddCountry(String addCountry) {
        this.addCountry = addCountry == null ? null : addCountry.trim();
    }

    public String getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo == null ? null : addInfo.trim();
    }

    public Integer getAddDefault() {
        return addDefault;
    }

    public void setAddDefault(Integer addDefault) {
        this.addDefault = addDefault;
    }
}