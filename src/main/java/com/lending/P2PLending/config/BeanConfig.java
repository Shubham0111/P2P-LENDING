package com.lending.P2PLending.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.lending.P2Plending.*")
@EnableAspectJAutoProxy
public class BeanConfig {
}
