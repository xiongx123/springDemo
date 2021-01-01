package com.xiongchao.gulimall.member.feign;

import com.xiongchao.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon//member/list")
    public R membercoupons();
}
