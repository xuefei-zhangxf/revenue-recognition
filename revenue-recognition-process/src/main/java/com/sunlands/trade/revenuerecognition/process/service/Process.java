package com.sunlands.trade.revenuerecognition.process.service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zxf
 * Date: 2017/8/7
 * Time: 下午9:48
 * To change this template use File | Settings | File Templates.
 */
public interface Process<T> {

    void process(List<T> list);
}
