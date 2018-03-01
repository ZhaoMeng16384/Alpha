package com.orange.alpha.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @Author:MengZhao
 * @Descirption:
 * @Date:Created in 14:48 2018/3/1
 */
@Service
public class TestImpl implements TestService {


    @Override
    public String test() {
        return "hello world!!";
    }
}
