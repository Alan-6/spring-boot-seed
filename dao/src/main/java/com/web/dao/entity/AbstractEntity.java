package com.web.dao.entity;

import java.util.Date;

/**
 * @author LuHailun
 * @Title: AbstractEntity
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 17:56
 */
public class AbstractEntity {
    private int id;
    private String remark;
    private Date createdDate;
    private int createdUser;
    private Date updatedDate;
    private int updatedUser;

    public AbstractEntity() {
    }

    public AbstractEntity(int id, String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser) {
        this.id = id;
        this.remark = remark;
        this.createdDate = createdDate;
        this.createdUser = createdUser;
        this.updatedDate = updatedDate;
        this.updatedUser = updatedUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(int createdUser) {
        this.createdUser = createdUser;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public int getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(int updatedUser) {
        this.updatedUser = updatedUser;
    }
}
