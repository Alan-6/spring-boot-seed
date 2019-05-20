package com.web.bo;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LuHailun
 * @Title: PermissionBO
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 14:41
 */
@Data
@ToString(callSuper = true)
public class PermissionBO extends AbstractBO {

    private int available;

    private String name;

    private int parentId;

    private String permission;

    private String resourceType;

    private String url;

    private List<RoleBO> roles = new ArrayList<RoleBO>();

    public PermissionBO() {
    }

    public PermissionBO(int id, String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser, int available, String name, int parentId, String permission, String resourceType, String url, List<RoleBO> roles) {
        super(id, remark, createdDate, createdUser, updatedDate, updatedUser);
        this.available = available;
        this.name = name;
        this.parentId = parentId;
        this.permission = permission;
        this.resourceType = resourceType;
        this.url = url;
        this.roles = roles;
    }
}
