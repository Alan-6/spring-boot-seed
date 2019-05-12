package com.web.test;

import com.web.WebApplication;
import com.web.bo.product.ProductBO;
import com.web.dao.entity.product.ProductEntity;
import com.web.dao.mapper.product.ProductMapper;
import com.web.service.ProductService;
import com.web.vo.product.ProductVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author LuHailun
 * @Title: ProductMapperTest
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 19:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebApplication.class)
public class ProductMapperTest {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductService productService;

    @Test
    public void testGetOne() throws Exception {
        ProductEntity entity = productMapper.getOne(1L);
        System.out.println(entity.getName());
    }

    //@Test
    public void testInsert() throws Exception {
        ProductEntity entity = new ProductEntity();
        entity.setName("油条");
        entity.setNumber(10L);
        productMapper.insert(entity);
    }

    //@Test
    public void testServiceInsert() throws Exception {
        ProductBO bo = new ProductBO();
        bo.setName("豆浆");
        bo.setNumber(10);
        productService.insert(bo);
    }

    //@Test
    public void testServiceGetOne() throws Exception {
        ProductVO vo = productService.getOne(2);
        System.out.println(vo.toString());
    }
}
