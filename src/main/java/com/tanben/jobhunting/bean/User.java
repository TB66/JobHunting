package com.tanben.jobhunting.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer pkUser;

    private String account;

    private String pwd;

    private String name;

    private String sex;

    private String image;

    private String phone;

    private String address;

    private String email;

    private String category;

    private String resume;

    private String hopejobs;

    private String passedjobs;

    private String viewedjobs;

    private String favjobs;

    private String jobdescription;

    private Date changetime;

    private Date ts;

    private Integer dr;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private String def5;

    private static final long serialVersionUID = 1L;

    public Integer getPkUser() {
        return pkUser;
    }

    public void setPkUser(Integer pkUser) {
        this.pkUser = pkUser;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }

    public String getHopejobs() {
        return hopejobs;
    }

    public void setHopejobs(String hopejobs) {
        this.hopejobs = hopejobs == null ? null : hopejobs.trim();
    }

    public String getPassedjobs() {
        return passedjobs;
    }

    public void setPassedjobs(String passedjobs) {
        this.passedjobs = passedjobs == null ? null : passedjobs.trim();
    }

    public String getViewedjobs() {
        return viewedjobs;
    }

    public void setViewedjobs(String viewedjobs) {
        this.viewedjobs = viewedjobs == null ? null : viewedjobs.trim();
    }

    public String getFavjobs() {
        return favjobs;
    }

    public void setFavjobs(String favjobs) {
        this.favjobs = favjobs == null ? null : favjobs.trim();
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription == null ? null : jobdescription.trim();
    }

    public Date getChangetime() {
        return changetime;
    }

    public void setChangetime(Date changetime) {
        this.changetime = changetime;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1 == null ? null : def1.trim();
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2 == null ? null : def2.trim();
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3 == null ? null : def3.trim();
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4 == null ? null : def4.trim();
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5 == null ? null : def5.trim();
    }
}