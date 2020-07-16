package com.smday.netctoss.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Summerday
 */

@Configuration
@MapperScan(basePackages = {"com.smday.netctoss.mbg.mapper"})
public class MyBatisConfig {


}
