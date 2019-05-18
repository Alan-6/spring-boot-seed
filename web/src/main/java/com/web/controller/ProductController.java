package com.web.controller;

import com.web.bo.product.ProductBO;
import com.web.service.ProductService;
import com.web.vo.product.ProductVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author LuHailun
 * @Title: ProductController
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 18:09
 */
@RestController
@Api(tags = "产品管理接口")
public class ProductController {

    @Autowired
    ProductService productService;

    @ApiOperation("获取产品")
    @GetMapping("/product")
    public String getProduct() {

        Date now = new Date();

        ProductVO vo = new ProductVO();
        vo.setName("煎饼果子");
        vo.setNumber(5);
        vo.setCreatedDate(now);
        vo.setCreatedUser(1);
        vo.setUpdatedDate(now);
        vo.setUpdatedUser(1);
        return vo.toString();
    }

    @ApiOperation("添加产品")
    @PostMapping("/product")
    public void saveProduct() {

        Date now = new Date();

        ProductBO bo = new ProductBO();
        bo.setName("煎饼果子");
        bo.setNumber(10);
        bo.setCreatedDate(now);
        bo.setCreatedUser(1);
        bo.setUpdatedDate(now);
        bo.setUpdatedUser(1);
    }
}
