package org.bj.ldyh.model;

import java.util.Date;

public class Customer {
    private Integer cid;

    private String name;

    private Integer age;

    private String industry;

    private String address;

    private String importance;

    private String gender;

    private Date createtime;

    private Date updatetime;


    public Customer(Integer cid, String name, Integer age, String industry, String address, String importance, String gender, Date createtime, Date updatetime) {
        this.cid = cid;
        this.name = name;
        this.age = age;
        this.industry = industry;
        this.address = address;
        this.importance = importance;
        this.gender = gender;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public Customer() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance == null ? null : importance.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
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