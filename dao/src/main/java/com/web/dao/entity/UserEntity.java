package com.web.dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LuHailun
 * @Title: UserEntity
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/18 19:56
 */
@Entity
@Table(name = "user")
public class UserEntity extends AbstractEntity {

    @Column(name = "account")
    private String account;

    @Column(name = "password")
    private String password;

    @Column(name = "salt")
    private String salt;

    @Column(name = "state")
    private int state;

    @Column(name = "username")
    private String username;

    @ManyToMany
    @JoinTable(
            name = "sys_user_role",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}
    )
    private List<RoleEntity> roles = new ArrayList<RoleEntity>();

    public UserEntity() {
    }

    public UserEntity(int id, Date createdDate, int createdUser, Date updatedDate, int updatedUser, String account, String password, String salt, int state, String username) {
        super(id, createdDate, createdUser, updatedDate, updatedUser);
        this.account = account;
        this.password = password;
        this.salt = salt;
        this.state = state;
        this.username = username;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleEntity> roles) {
        this.roles = roles;
    }
}
