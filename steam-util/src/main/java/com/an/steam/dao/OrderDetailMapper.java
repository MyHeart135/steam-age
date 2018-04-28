package com.an.steam.dao;

import com.an.steam.bean.OrderDetail;
import java.util.List;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderDetail record);

    OrderDetail selectByPrimaryKey(String id);

    List<OrderDetail> selectAll();

    int updateByPrimaryKey(OrderDetail record);
}