package com.mapper;

import com.po.ItripHotelOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ItripHotelOrderMapper {


	public List<ItripHotelOrder>	getItripHotelOrderListByMap(Map<String, Object> param)throws Exception;

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
