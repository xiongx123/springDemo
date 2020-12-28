package com.xiongchao.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiongchao.common.utils.PageUtils;
import com.xiongchao.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author xiongchao
 * @email xiongchao@gmail.com
 * @date 2020-12-27 09:35:24
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

