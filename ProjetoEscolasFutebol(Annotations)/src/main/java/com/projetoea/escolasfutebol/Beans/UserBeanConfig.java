package com.projetoea.escolasfutebol.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserBeanConfig {
    @Bean(name = "UserBean")
    public UserBean getUserBean() { return new UserBean(); }
}
