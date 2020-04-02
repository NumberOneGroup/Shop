package com.service.api.wexin;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 马运动
 * @date 2020/4/2 9:14
 */
public interface TestService {

    /**
     * @param name 用户名
     * @return 返回123
     */
    @GetMapping("weixin")
    String weiXin(String name);
}
