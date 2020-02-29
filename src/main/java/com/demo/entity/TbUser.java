package com.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TbUser {
    private Long uid;

    private String uAccount;

    private String uPwd;

    private String uMininame;

    private Integer uState;

    private String uEmail;

    private String uAddress;

    private String uPhone;

    private BigDecimal uBalance;

    private Integer uVip;

    private String uCredits;

    private Date uRegisttime;

    private Date uUpdatetime;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getuAccount() {
        return uAccount;
    }

    public void setuAccount(String uAccount) {
        this.uAccount = uAccount == null ? null : uAccount.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public String getuMininame() {
        return uMininame;
    }

    public void setuMininame(String uMininame) {
        this.uMininame = uMininame == null ? null : uMininame.trim();
    }

    public Integer getuState() {
        return uState;
    }

    public void setuState(Integer uState) {
        this.uState = uState;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public BigDecimal getuBalance() {
        return uBalance;
    }

    public void setuBalance(BigDecimal uBalance) {
        this.uBalance = uBalance;
    }

    public Integer getuVip() {
        return uVip;
    }

    public void setuVip(Integer uVip) {
        this.uVip = uVip;
    }

    public String getuCredits() {
        return uCredits;
    }

    public void setuCredits(String uCredits) {
        this.uCredits = uCredits == null ? null : uCredits.trim();
    }

    public Date getuRegisttime() {
        return uRegisttime;
    }

    public void setuRegisttime(Date uRegisttime) {
        this.uRegisttime = uRegisttime;
    }

    public Date getuUpdatetime() {
        return uUpdatetime;
    }

    public void setuUpdatetime(Date uUpdatetime) {
        this.uUpdatetime = uUpdatetime;
    }
}