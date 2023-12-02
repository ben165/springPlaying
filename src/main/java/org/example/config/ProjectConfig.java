package org.example.config;

import org.example.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    @Primary
    Parrot parrot1 () {
        Parrot p = new Parrot();
        p.setName("1. Vogel");
        return p;
    }

    @Bean
    Parrot parrot2 () {
        Parrot p = new Parrot();
        p.setName("2. Vogel");
        return p;
    }

    @Bean
    Parrot parrot3 () {
        Parrot p = new Parrot();
        p.setName("3. Vogel");
        return p;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }


}
