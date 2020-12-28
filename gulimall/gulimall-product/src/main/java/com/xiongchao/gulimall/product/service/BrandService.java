package com.xiongchao.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiongchao.common.utils.PageUtils;
import com.xiongchao.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author xiongchao
 * @email xiongchao@gmail.com
 * @date 2020-12-27 08:47:34
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

