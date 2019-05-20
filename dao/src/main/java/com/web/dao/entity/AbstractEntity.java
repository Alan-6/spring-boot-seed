package com.web.dao.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author LuHailun
 * @Title: AbstractEntity
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 17:56
 */
@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "create_date")
    private Date createdDate;

    @Column(name = "create_user")
    private int createdUser;

    @Column(name = "update_date")
    private Date updatedDate;

    @Column(name = "update_user")
    private int updatedUser;

    public AbstractEntity() {
    }

    public AbstractEntity(int id, Date createdDate, int createdUser, Date updatedDate, int updatedUser) {
        this.id = id;
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
