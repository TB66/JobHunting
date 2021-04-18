package com.tanben.jobhunting.bean;

import java.io.Serializable;
import java.util.Date;

public class Educback implements Serializable {
    private Integer pkEducback;

    private Integer pkResume;

    private String pkUser;

    private String period;

    private String school;

    private String desc;

    private Date changetime;

    private Date ts;

    private Integer dr;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private String def5;

    private static final long serialVersionUID = 1L;

    public Integer getPkEducback() {
        return pkEducback;
    }

    public void setPkEducback(Integer pkEducback) {
        this.pkEducback = pkEducback;
    }

    public Integer getPkResume() {
        return pkResume;
    }

    public void setPkResume(Integer pkResume) {
        this.pkResume = pkResume;
    }

    public String getPkUser() {
        return pkUser;
    }

    public void setPkUser(String pkUser) {
        this.pkUser = pkUser == null ? null : pkUser.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
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