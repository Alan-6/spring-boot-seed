package com.web.dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LuHailun
 * @Title: RoleEntity
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/18 20:02
 */
@Entity
@Table(name = "sys_role")
public class RoleEntity extends AbstractEntity {

    @Column(name = "available")
    private int available;

    @Column(name = "role")
    private String role;

    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable(
            name = "sys_user_role",
            joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")}
    )
    private List<UserEntity> users = new ArrayList<UserEntity>();

    @ManyToMany
    @JoinTable(
            name = "sys_role_permission",
            joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "permission_id", referencedColumnName = "id")}
    )
    private List<PermissionEntity> permissions = new ArrayList<PermissionEntity>();

    public RoleEntity() {
    }

    public RoleEntity(int id, Date createdDate, int createdUser, Date updatedDate, int updatedUser, int available, String role, String description) {
        super(id, createdDate, createdUser, updatedDate, updatedUser);
        this.available = available;
        this.role = role;
        this.description = description;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

    public List<PermissionEntity> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionEntity> permissions) {
        this.permissions = permissions;
    }
}
