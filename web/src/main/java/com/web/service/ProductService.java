package com.web.service;

import com.web.bo.product.ProductBO;
import com.web.vo.product.ProductVO;

import java.util.List;

/**
 * @author LuHailun
 * @Title: ProductService
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 18:10
 */
public interface ProductService {

    void insert(ProductBO bo);

    void delete(long id);

    void update(ProductBO bo);

    ProductVO getOne(long id);

    List<ProductVO> getAll();
}
