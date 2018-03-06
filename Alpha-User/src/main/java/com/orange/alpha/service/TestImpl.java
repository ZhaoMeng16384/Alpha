package com.orange.alpha.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.orange.alpha.facade.user.TestService;

/**
 * @Author:MengZhao
 * @Descirption:
 * @Date:Created in 14:48 2018/3/1
 */
@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class TestImpl implements TestService {


    @Override
    public String test() {
        return "hello world!!";
    }
}
