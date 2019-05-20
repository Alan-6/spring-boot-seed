package com.web.vo;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LuHailun
 * @Title: RoleVO
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 14:34
 */
@Data
@ToString(callSuper = true)
public class RoleVO extends AbstractVO {

    private int available;

    private String role;

    private String description;

    private List<UserVO> users = new ArrayList<UserVO>();

    private List<PermissionVO> permissions = new ArrayList<PermissionVO>();

    public RoleVO() {
    }

    public RoleVO(int id, Date createdDate, int createdUser, Date updatedDate, int updatedUser, int available, String role, String description, List<UserVO> users, List<PermissionVO> permissions) {
        super(id, createdDate, createdUser, updatedDate, updatedUser);
        this.available = available;
        this.role = role;
        this.description = description;
        this.users = users;
        this.permissions = permissions;
    }
}
