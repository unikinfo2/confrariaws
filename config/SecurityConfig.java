package com.apirest.confrariaws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig  {
	
	@Bean
    public MapReactiveUserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
		UserDetails user = org.springframework.security.core.userdetails.User  
			      .withUsername("user")
			      .password(passwordEncoder.encode("123"))  //encoder().encode("123")
			      .roles("ADMIN")
			      .build();
		System.out.println("Senha: " + passwordEncoder.encode("123"));
	    return new MapReactiveUserDetailsService(user);		
    }
	
	@Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
        	.csrf().disable().authorizeExchange()
	        .and().authorizeExchange()
	        .pathMatchers("/**")
	        .permitAll()
	        .anyExchange().authenticated()
	        .and().httpBasic()
	        .and().formLogin();
        return http.build();
    }	
	
	@Bean
	public PasswordEncoder encoder() {
	    return new BCryptPasswordEncoder();
	}	
}
