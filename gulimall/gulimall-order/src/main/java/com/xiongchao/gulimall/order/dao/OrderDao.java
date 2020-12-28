package com.xiongchao.gulimall.order.dao;

import com.xiongchao.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiongchao
 * @email xiongchao@gmail.com
 * @date 2020-12-27 09:20:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
