package com.sunlands.trade.revenuerecognition.process.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: zxf
 * Date: 2017/8/11
 * Time: 下午8:58
 * To change this template use File | Settings | File Templates.
 */
@Component
public class TestTask {

    /**
     * Scheduled at fix rate once per 300s (5min)
     */
    @Scheduled(initialDelay = 1000 * 2, fixedRate = 1000 * 2)
    public void cleanExpiredAuthorizationTemplate() {
        System.out.println("?????\n");

    }


}