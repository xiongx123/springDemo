package com.xiongchao.gulimall.product.dao;

import com.xiongchao.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author xiongchao
 * @email xiongchao@gmail.com
 * @date 2020-12-27 08:47:34
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
