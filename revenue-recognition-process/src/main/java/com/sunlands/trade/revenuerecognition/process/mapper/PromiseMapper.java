package com.sunlands.trade.revenuerecognition.process.mapper;

import com.sunlands.trade.domain.Promise;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by IntelliJ IDEA.
 * User: zxf
 * Date: 2017/8/11
 * Time: 下午4:39
 * To change this template use File | Settings | File Templates.
 */
@Mapper
public interface PromiseMapper {

    @Select("SELECT * FROM promise WHERE status = #{status}")
    Promise findByStatus(@Param("status") String status);

    @Select("SELECT COUNT(*) from promise")
    Integer count();
}
