package com.tanben.jobhunting.bean;

import java.io.Serializable;
import java.util.Date;

public class Chat implements Serializable {
    private Integer pkChat;

    private Integer pkSendUser;

    private Integer pkReceiveUser;

    private String message;

    private Date sendtime;

    private Date ts;

    private Integer dr;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private String def5;

    private static final long serialVersionUID = 1L;

    public Integer getPkChat() {
        return pkChat;
    }

    public void setPkChat(Integer pkChat) {
        this.pkChat = pkChat;
    }

    public Integer getPkSendUser() {
        return pkSendUser;
    }

    public void setPkSendUser(Integer pkSendUser) {
        this.pkSendUser = pkSendUser;
    }

    public Integer getPkReceiveUser() {
        return pkReceiveUser;
    }

    public void setPkReceiveUser(Integer pkReceiveUser) {
        this.pkReceiveUser = pkReceiveUser;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
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