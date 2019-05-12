package com.web.service;

import com.web.bo.product.ProductBO;
import com.web.dao.entity.product.ProductEntity;
import com.web.dao.mapper.product.ProductMapper;
import com.web.vo.product.ProductVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LuHailun
 * @Title: ProductServiceImpl
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 18:11
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    public void insert(ProductBO bo) {
        ProductEntity entity = new ProductEntity();
        BeanUtils.copyProperties(bo, entity);
        productMapper.insert(entity);
    }

    public void delete(long id) {
        productMapper.delete(id);
    }

    public void update(ProductBO bo) {
        ProductEntity entity = new ProductEntity();
        BeanUtils.copyProperties(bo, entity);
        productMapper.update(entity);
    }

    public ProductVO getOne(long id) {
        ProductVO vo = new ProductVO();
        ProductEntity entity = productMapper.getOne(id);
        BeanUtils.copyProperties(entity, vo);
        return vo;
    }

    public List<ProductVO> getAll() {

        List<ProductVO> vos = new ArrayList<ProductVO>();
        List<ProductEntity> entities = productMapper.getAll();
        for (ProductEntity entity : entities) {
            ProductVO vo = new ProductVO();
            BeanUtils.copyProperties(entity, vo);
            vos.add(vo);
        }
        return vos;
    }
}
