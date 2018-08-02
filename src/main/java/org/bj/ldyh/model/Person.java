package org.bj.ldyh.model;

import java.util.Date;

public class Person {
    private Integer pid;

    private String name;

    private Integer age;

    private String worktime;

    private String gender;

    private Date createtime;

    private Date updatetime;

    public Person(Integer pid, String name, Integer age, String worktime, String gender, Date createtime, Date updatetime) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.worktime = worktime;
        this.gender = gender;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public Person() {
        super();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime == null ? null : worktime.trim();
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