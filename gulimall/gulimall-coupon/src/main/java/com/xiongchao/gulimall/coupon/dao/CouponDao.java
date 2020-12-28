package com.xiongchao.gulimall.coupon.dao;

import com.xiongchao.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xiongchao
 * @email xiongchao@gmail.com
 * @date 2020-12-27 09:33:14
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
