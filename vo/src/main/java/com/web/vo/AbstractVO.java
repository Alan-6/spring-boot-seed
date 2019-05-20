package com.web.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author LuHailun
 * @Title: AbstractVO
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 17:49
 */
@Data
@ToString
public abstract class AbstractVO {

    private int id;
    private Date createdDate;
    private int createdUser;
    private Date updatedDate;
    private int updatedUser;

    public AbstractVO() {
    }

    public AbstractVO(Date createdDate, int createdUser, Date updatedDate, int updatedUser) {
        this.createdDate = createdDate;
        this.createdUser = createdUser;
        this.updatedDate = updatedDate;
        this.updatedUser = updatedUser;
    }

    public AbstractVO(int id, Date createdDate, int createdUser, Date updatedDate, int updatedUser) {
        this.id = id;
        this.createdDate = createdDate;
        this.createdUser = createdUser;
        this.updatedDate = updatedDate;
        this.updatedUser = updatedUser;
    }
}
