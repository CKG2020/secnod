package com.example.javaanli.demo.Model;

public class Record {

    private int id;
    private String stu_number;
    private String stu_class;
    private String stu_name;
    private String qingjia_time;
    private String start_time;
    private String end_time;
    private String qingjia_reason;
    private String class_tea_status;
    private  String tea_sp_time;
    private String tea_restore;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStu_number() {
        return stu_number;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", stu_number='" + stu_number + '\'' +
                ", stu_class='" + stu_class + '\'' +
                ", stu_name='" + stu_name + '\'' +
                ", qingjia_time='" + qingjia_time + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", qingjia_reason='" + qingjia_reason + '\'' +
                ", class_tea_status='" + class_tea_status + '\'' +
                ", tea_sp_time='" + tea_sp_time + '\'' +
                ", tea_restore='" + tea_restore + '\'' +
                '}';
    }

    public void setStu_number(String stu_number) {
        this.stu_number = stu_number;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_class() {
        return stu_class;
    }

    public void setStu_class(String stu_class) {
        this.stu_class = stu_class;
    }

    public String getQingjia_time() {
        return qingjia_time;
    }

    public void setQingjia_time(String qingjia_time) {
        this.qingjia_time = qingjia_time;
    }

//    public String getSatrt_time() {
//        return satrt_time;
//    }
//
//    public void setSatrt_time(String satrt_time) {
//        this.satrt_time = satrt_time;
//    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getQingjia_reason() {
        return qingjia_reason;
    }

    public void setQingjia_reason(String qingjia_reason) {
        this.qingjia_reason = qingjia_reason;
    }

    public String getClass_tea_status() {
        return class_tea_status;
    }

    public void setClass_tea_status(String class_tea_status) {
        this.class_tea_status = class_tea_status;
    }

    public String getTea_sp_time() {
        return tea_sp_time;
    }

    public void setTea_sp_time(String tea_sp_time) {
        this.tea_sp_time = tea_sp_time;
    }

    public String getTea_restore() {
        return tea_restore;
    }

    public void setTea_restore(String tea_restore) {
        this.tea_restore = tea_restore;
    }
}
