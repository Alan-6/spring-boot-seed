package com.web.bo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author LuHailun
 * @Title: AbstractBO
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 17:45
 */
@Data
@ToString
public abstract class AbstractBO {

    private int id;
    private String remark;
    private Date createdDate;
    private int createdUser;
    private Date updatedDate;
    private int updatedUser;

    public AbstractBO() {
    }

    public AbstractBO(String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser) {
        this.remark = remark;
        this.createdDate = createdDate;
        this.createdUser = createdUser;
        this.updatedDate = updatedDate;
        this.updatedUser = updatedUser;
    }

    public AbstractBO(int id, String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser) {
        this.id = id;
        this.remark = remark;
        this.createdDate = createdDate;
        this.createdUser = createdUser;
        this.updatedDate = updatedDate;
        this.updatedUser = updatedUser;
    }
}
