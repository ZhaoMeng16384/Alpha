package com.orange.alpha.user;

import com.orange.alpha.rsp.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author:MengZhao
 * @Descirption:
 * @Date:Created in 17:22 2018/3/2
 */
@RestController
public interface TestController {
    @GetMapping("/test")
    public Result test(HttpServletResponse response);
}
