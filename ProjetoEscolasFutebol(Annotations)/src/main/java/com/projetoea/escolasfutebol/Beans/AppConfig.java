package com.projetoea.escolasfutebol.Beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;

@Configuration
@Import( { UserBeanConfig.class, GuestBeanConfig.class } )
public class AppConfig { }
