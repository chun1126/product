package com.imooc.product.service;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSInput;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lihaochun on 2018/10/25.
 */
@Component
public class CategoryServiceTest extends ProductApplicationTests{
    @Autowired
    private CategoryService categoryService;
    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> list=categoryService.findByCategoryTypeIn(Arrays.asList(1,22));
        Assert.assertTrue(list.size()>0);
    }

}