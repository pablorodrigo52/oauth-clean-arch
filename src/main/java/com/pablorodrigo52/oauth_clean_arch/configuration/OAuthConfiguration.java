package com.pablorodrigo52.oauth_clean_arch.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class OAuthConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.authorizeHttpRequests(
            httpRequest -> {
                httpRequest.requestMatchers("/token").permitAll();
                httpRequest.requestMatchers("/public/*").permitAll();
                httpRequest.requestMatchers("/logout").permitAll();
                httpRequest.anyRequest().authenticated(); // base principle
            }
        )
        .oauth2Login(Customizer.withDefaults()) 
        .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
        .build();
    }
}
