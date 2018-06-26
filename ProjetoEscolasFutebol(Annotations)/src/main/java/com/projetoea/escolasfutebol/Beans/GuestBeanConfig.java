package com.projetoea.escolasfutebol.Beans;


import com.projetoea.escolasfutebol.ClassesJava.Jogo;
import org.orm.PersistentException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GuestBeanConfig {
    @Bean("GuestBean")
    public GuestBean GetGuestBean() {return new GuestBean();}
}
