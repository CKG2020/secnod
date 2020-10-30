package com.example.javaanli.demo.entity1;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

public class LogInfo implements Serializable {

    private static final long serialVersionUID = 7672148872967466228L;

    @Id
    private int id;
    private String logOp;
    private String logType;
    private Date createTime;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogOp() {
        return logOp;
    }

    public void setLogOp(String logOp) {
        this.logOp = logOp;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
