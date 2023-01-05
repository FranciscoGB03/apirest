package com.pgonbo.apirest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        // implementación de login a través de OAUTH2 con github
        http.csrf().ignoringAntMatchers("/productos", "/encoding") // ignora esas rutas por lo que no pide autenticacion
                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .and()
                .authorizeHttpRequests()
                .antMatchers("/pokemon").authenticated() // Esta ruta por el contrario necesita tener autorizacion por
                                                         // lo que solicita la aprobación a través de github
                .and().oauth2Login();
        return http.build();

    }
}
