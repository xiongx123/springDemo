package com.xiongchao.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiongchao.common.utils.PageUtils;
import com.xiongchao.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author xiongchao
 * @email xiongchao@gmail.com
 * @date 2020-12-27 09:33:14
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

