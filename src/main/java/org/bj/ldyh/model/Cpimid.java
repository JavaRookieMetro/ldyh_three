package org.bj.ldyh.model;

import java.util.Date;

public class Cpimid {
    private Integer cpid;

    private Integer cid;

    private Integer pid;

    private Date createtime;

    private Date updatetime;

    public Cpimid(Integer cpid, Integer cid, Integer pid, Date createtime, Date updatetime) {
        this.cpid = cpid;
        this.cid = cid;
        this.pid = pid;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public Cpimid() {
        super();
    }

    public Integer getCpid() {
        return cpid;
    }

    public void setCpid(Integer cpid) {
        this.cpid = cpid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}