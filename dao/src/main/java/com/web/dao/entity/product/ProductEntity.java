package com.web.dao.entity.product;

import com.web.dao.entity.AbstractEntity;

import java.util.Date;

/**
 * @author LuHailun
 * @Title: ProductEntity
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 17:57
 */
public class ProductEntity extends AbstractEntity {

    private String name;
    private long number;

    public ProductEntity() {
    }

    public ProductEntity(int id, String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser, String name, long number) {
        super(id, remark, createdDate, createdUser, updatedDate, updatedUser);
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}
