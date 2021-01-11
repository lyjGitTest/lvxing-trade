package com.service;

import com.po.ItripHotelOrder;

import java.util.Map;

public interface ItripHotelOrderService {
    /**通过订单编号查询订单信息**/
    public ItripHotelOrder getItripHotelOrderListByMap(Map<String, Object> param)throws Exception;
    /**
     * 通过订单编号修改订单状态为已支付
     *
     * */
    public Integer updateHotelOrderorderNoStatus(Map<String, Object> param)throws Exception;
    /**
     * 通过订单编号修改订单状态为已入住
     *
     * */
    public Integer updateHotelOrderorderNoStatusT(Map<String, Object> param)throws Exception;
}
