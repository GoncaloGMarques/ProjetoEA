package com.projetoea.escolasfutebol.Beans;

import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

///This bean is intended for Users like 'Arbitro' and Diretores
@Configuration
public class UserBeanConfig {
    @Bean(name = "UserBean")
    public UserBean getUserBean() { return new UserBean(); }

    @Bean(name = "DiretorAssociacaoBean")
    public DiretorAssociacaoBean getDiretorAssociacaoBean() { return new DiretorAssociacaoBean(); }
}
