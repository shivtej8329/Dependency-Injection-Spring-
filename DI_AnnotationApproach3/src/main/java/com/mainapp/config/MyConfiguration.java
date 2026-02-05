package com.mainapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.mainapp")
@PropertySource("classpath:config.properties")
public class MyConfiguration {

}
