package com.web.bo.product;

import com.web.bo.AbstractBO;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author LuHailun
 * @Title: ProductBO
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 17:46
 */
@Data
@ToString(callSuper = true)
public class ProductBO extends AbstractBO {

    private String name;
    private long number;

    public ProductBO() {
    }

    public ProductBO(String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser, String name, long number) {
        super(remark, createdDate, createdUser, updatedDate, updatedUser);
        this.name = name;
        this.number = number;
    }

    public ProductBO(int id, String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser, String name, long number) {
        super(id, remark, createdDate, createdUser, updatedDate, updatedUser);
        this.name = name;
        this.number = number;
    }
}
