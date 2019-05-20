package com.web.vo;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LuHailun
 * @Title: ProductVO
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 17:50
 */
@Data
@ToString(callSuper = true)
public class UserVO extends AbstractVO {

    private String account;

    private String password;

    private String salt;

    private int state;

    private String username;

    private List<RoleVO> roles = new ArrayList<RoleVO>();

    public UserVO() {
    }

    public UserVO(int id, Date createdDate, int createdUser, Date updatedDate, int updatedUser, String account, String password, String salt, int state, String username, List<RoleVO> roles) {
        super(id, createdDate, createdUser, updatedDate, updatedUser);
        this.account = account;
        this.password = password;
        this.salt = salt;
        this.state = state;
        this.username = username;
        this.roles = roles;
    }

}
