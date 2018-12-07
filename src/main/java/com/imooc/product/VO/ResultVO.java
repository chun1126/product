package com.imooc.product.VO;

import lombok.Data;

/**
 * Created by lihaochun on 2018/10/25.
 */
@Data
public class ResultVO<T> {
    private Integer code;

    private  String msg;

    private T data;

}
