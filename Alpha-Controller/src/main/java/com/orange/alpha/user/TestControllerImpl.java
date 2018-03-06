package com.orange.alpha.user;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Reference;
import com.orange.alpha.facade.user.TestService;
import com.orange.alpha.rsp.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author:MengZhao
 * @Descirption:
 * @Date:Created in 15:47 2018/3/1
 */
@RestController
public class TestControllerImpl implements TestController {
    @Reference(version = "1.0.0")
    private TestService testService;


    @Override
    public Result test(HttpServletResponse response) {
        if(StringUtils.isNotEmpty(testService.test())){
            return Result.newSuccessResult();
        }else {
            return Result.newFailureResult();
        }
    }
}
