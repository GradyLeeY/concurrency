package com.grady.concurencylearning;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @Author HUAWEI
 * @DATE 2020/12/5 17:40
 */
@Controller
@Slf4j
public class TestController {


    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "text";
    }
}
