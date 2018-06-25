package com.projetoea.escolasfutebol.Beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import( { UserBeanConfig.class } )
public class AppConfig { }
