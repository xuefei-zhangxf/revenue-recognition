package com.sunlands.trade.revenuerecognitionwebapi.controller;

import com.sunlands.trade.domain.Promise;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: zxf
 * Date: 2017/8/11
 * Time: 下午2:42
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class TestController {

    @RequestMapping("/greeting")
    public Promise greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Promise();
    }



}
