package com.sunlands.trade.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: zxf
 * Date: 2017/8/11
 * Time: 下午4:47
 * To change this template use File | Settings | File Templates.
 */
@Data
public class Promise implements Serializable {

    private Integer id;
    private String depositId;
    private String orderNumber;
    private Integer promisePeriod;
    private BigDecimal promiseAmount;
    private BigDecimal promiseAmountResidue;
    private Date endTime;
    private String status;
    private Date createTime;
    private Date modifyTime;
}
