package com.service.Impl;

import com.mapper.ItripHotelOrderMapper;
import com.po.ItripHotelOrder;
import com.service.ItripHotelOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ItripHotelOrderServiceImpl implements ItripHotelOrderService {
    @Autowired
    private ItripHotelOrderMapper itripHotelOrderMapper;
    @Override
    public ItripHotelOrder getItripHotelOrderListByMap(Map<String, Object> param) throws Exception {
        List<ItripHotelOrder> itripHotelOrders=itripHotelOrderMapper.getItripHotelOrderListByMap(param);
        if (itripHotelOrders.size()==1){
            return itripHotelOrders.get(0);
        }
        return null;
    }

    @Override
    public Integer updateHotelOrderorderNoStatus(Map<String, Object> param) throws Exception {
        return itripHotelOrderMapper.updateHotelOrderorderNoStatus(param);
    }

    @Override
    public Integer updateHotelOrderorderNoStatusT(Map<String, Object> param) throws Exception {
        return itripHotelOrderMapper.updateHotelOrderorderNoStatusT(param);
    }
}
