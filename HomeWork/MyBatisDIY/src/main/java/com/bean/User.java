package com.bean;

import java.security.PrivateKey;

public class User {
    private int  sid;
    private String sname;
    private  String ssex;
    private  String sdept;
    private  int sage;
    private  String asddress;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSdept(String string) {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getAsddress() {
        return asddress;
    }

    public void setAsddress(String asddress) {
        this.asddress = asddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", sdept='" + sdept + '\'' +
                ", sage=" + sage +
                ", asddress='" + asddress + '\'' +
                '}';
    }
}
