package com.xiongchao.gulimall.ware.dao;

import com.xiongchao.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author xiongchao
 * @email xiongchao@gmail.com
 * @date 2020-12-27 09:26:05
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
