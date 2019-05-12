package com.web.dao.mapper.product;

import com.web.dao.entity.product.ProductEntity;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * @author LuHailun
 * @Title: ProductMapper
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 17:59
 */
public interface ProductMapper {

    @Select("SELECT * FROM product WHERE id = #{id}")
    @Results(id = "productMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "number", column = "number"),
            @Result(property = "remark", column = "remark"),
            @Result(property = "createdDate", column = "created_date", javaType = Date.class),
            @Result(property = "createdUser", column = "created_user"),
            @Result(property = "updatedDate", column = "updated_date", javaType = Date.class),
            @Result(property = "updatedUser", column = "updated_user")
    })
    ProductEntity getOne(Long id);

    @Select("SELECT * FROM product")
    @ResultMap(value = "productMap")
    List<ProductEntity> getAll();

    @Insert("INSERT into product(`name`,number,created_date,created_user,updated_date,updated_user)\n" +
            "VALUES(#{name},#{number},NOW(),1,NOW(),1)")
    void insert(ProductEntity user);

    @Update("UPDATE product SET `name`=#{name},number=#{number},remark=#{remark},updated_date=NOW(),updated_user=1 WHERE id=#{id}")
    void update(ProductEntity user);

    @Delete("DELETE FROM product WHERE id =#{id}")
    void delete(Long id);

}
