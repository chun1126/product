package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

/**
 * Created by lihaochun on 2018/10/26.
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
