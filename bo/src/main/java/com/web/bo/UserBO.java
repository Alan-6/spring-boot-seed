package com.web.bo;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LuHailun
 * @Title: UserBO
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 14:40
 */
@Data
@ToString(callSuper = true)
public class UserBO extends AbstractBO {

    private String account;

    private String password;

    private String salt;

    private int state;

    private String username;

    private List<RoleBO> roles = new ArrayList<RoleBO>();

    public UserBO() {
    }

    public UserBO(int id, String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser, String account, String password, String salt, int state, String username, List<RoleBO> roles) {
        super(id, remark, createdDate, createdUser, updatedDate, updatedUser);
        this.account = account;
        this.password = password;
        this.salt = salt;
        this.state = state;
        this.username = username;
        this.roles = roles;
    }
}
