package com.projetoea.escolasfutebol.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiretorEscolaBeanConfig {
    @Bean("DiretorEscolaBean")
    public DiretorEscolaBean GetGuestBean() {return new DiretorEscolaBean();}
}
