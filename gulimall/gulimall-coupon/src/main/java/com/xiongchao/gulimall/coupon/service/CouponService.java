package com.xiongchao.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiongchao.common.utils.PageUtils;
import com.xiongchao.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author xiongchao
 * @email xiongchao@gmail.com
 * @date 2020-12-27 09:33:14
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

