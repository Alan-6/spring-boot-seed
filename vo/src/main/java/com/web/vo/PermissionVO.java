package com.web.vo;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LuHailun
 * @Title: PermissionVO
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 14:37
 */
@Data
@ToString(callSuper = true)
public class PermissionVO extends AbstractVO {

    private int available;

    private String name;

    private int parentId;

    private String permission;

    private String resourceType;

    private String url;

    private List<RoleVO> roles = new ArrayList<RoleVO>();

    public PermissionVO() {
    }

    public PermissionVO(int id, Date createdDate, int createdUser, Date updatedDate, int updatedUser, int available, String name, int parentId, String permission, String resourceType, String url, List<RoleVO> roles) {
        super(id, createdDate, createdUser, updatedDate, updatedUser);
        this.available = available;
        this.name = name;
        this.parentId = parentId;
        this.permission = permission;
        this.resourceType = resourceType;
        this.url = url;
        this.roles = roles;
    }
}
