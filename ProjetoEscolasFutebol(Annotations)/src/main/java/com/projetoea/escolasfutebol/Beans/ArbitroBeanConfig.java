package com.projetoea.escolasfutebol.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArbitroBeanConfig {
    @Bean("ArbitroBean")
    public ArbitroBean GetArbitroBean() {return new ArbitroBean();}
}
