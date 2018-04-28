package com.an.steam.dao;

import com.an.steam.bean.OrderMain;
import java.util.List;

public interface OrderMainMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderMain record);

    OrderMain selectByPrimaryKey(Long id);

    List<OrderMain> selectAll();

    int updateByPrimaryKey(OrderMain record);
}