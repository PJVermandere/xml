package com.example.xml.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBeansConfiguration {
    @Bean
    DefaultKwadraatService kwadraat(){
        return new DefaultKwadraatService();
    }
}
