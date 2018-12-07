package com.imooc.product.service;

import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * Created by lihaochun on 2018/10/25.
 */
public interface ProductService {
    /*
    * 查询所有在架商品
    * */
    List<ProductInfo> findUpAll();
}
