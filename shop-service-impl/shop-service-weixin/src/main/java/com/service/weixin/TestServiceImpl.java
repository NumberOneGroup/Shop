package com.service.weixin;

import com.service.api.wexin.TestService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 马运动
 * @date 2020/4/2 9:12
 */
@RestController
public class TestServiceImpl implements TestService {
    @Override
    public String weiXin(String name) {
        System.out.println(name);
        return "123";
    }
}
