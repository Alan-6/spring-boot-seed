package com.web.bo;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LuHailun
 * @Title: RoleBO
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 14:40
 */
@Data
@ToString(callSuper = true)
public class RoleBO extends AbstractBO {

    private int available;

    private String role;

    private String description;

    private List<UserBO> users = new ArrayList<UserBO>();

    private List<PermissionBO> permissions = new ArrayList<PermissionBO>();

    public RoleBO() {
    }

    public RoleBO(int id, String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser, int available, String role, String description, List<UserBO> users, List<PermissionBO> permissions) {
        super(id, remark, createdDate, createdUser, updatedDate, updatedUser);
        this.available = available;
        this.role = role;
        this.description = description;
        this.users = users;
        this.permissions = permissions;
    }
}
