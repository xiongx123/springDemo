package com.xiongchao.gulimall.member.dao;

import com.xiongchao.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiongchao
 * @email xiongchao@gmail.com
 * @date 2020-12-27 09:35:24
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
