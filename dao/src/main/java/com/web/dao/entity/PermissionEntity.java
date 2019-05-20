package com.web.dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LuHailun
 * @Title: PermissionEntity
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/18 20:06
 */
@Entity
@Table(name = "sys_permission")
public class PermissionEntity extends AbstractEntity {

    @Column(name = "available")
    private int available;

    @Column(name = "name")
    private String name;

    @Column(name = "parent_id")
    private int parentId;

    @Column(name = "permission")
    private String permission;

    @Column(name = "resource_type")
    private String resourceType;

    @Column(name = "url")
    private String url;

    @ManyToMany
    @JoinTable(
            name = "sys_role_permission",
            joinColumns = {@JoinColumn(name = "permission_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}
    )
    private List<RoleEntity> roles = new ArrayList<RoleEntity>();

    public PermissionEntity() {
    }

    public PermissionEntity(int id, Date createdDate, int createdUser, Date updatedDate, int updatedUser, int available, String name, int parentId, String permission, String resourceType, String url) {
        super(id, createdDate, createdUser, updatedDate, updatedUser);
        this.available = available;
        this.name = name;
        this.parentId = parentId;
        this.permission = permission;
        this.resourceType = resourceType;
        this.url = url;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleEntity> roles) {
        this.roles = roles;
    }
}
