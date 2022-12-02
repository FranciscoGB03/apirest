package com.pgonbo.apirest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

    @Bean // uso de oauth2 con github
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        // Esta linea es para el uso de OAUTH2 sin embargo me falto saber como
        // implementarlo
        // http.authorizeHttpRequests().anyRequest().authenticated().and().oauth2Login();
        http.csrf().disable()
                .authorizeHttpRequests()
                .anyRequest().authenticated()
                .and().httpBasic();
        return http.build();
    }

    /*
     * @Bean
     * ClientRegistrationRepository clientRepository() {
     * ClientRegistration clientReg = clientRegistration();
     * return new InMemoryClientRegistrationRepository(clientReg);
     * }
     * 
     * private ClientRegistration clientRegistration() {
     * return CommonOAuth2Provider.GITHUB.getBuilder("github")
     * .clientId("bb432de3c1ed9e0b5e7c")
     * .clientSecret("2b77cdc6f5e3cfa6646bf9eebe0d449ce96a43cf").build();
     * }
     */

    @Bean // Bean para declarar el usuario y passwd
    UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(org.springframework.security.core.userdetails.User.withUsername("admin")
                .password(passwordEncoder().encode("admin"))
                .roles()
                .build());
        return manager;
    }

    @Bean
    AuthenticationManager authManager(HttpSecurity http) throws Exception {
        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .userDetailsService(userDetailsService())
                .passwordEncoder(passwordEncoder())
                .and()
                .build();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
