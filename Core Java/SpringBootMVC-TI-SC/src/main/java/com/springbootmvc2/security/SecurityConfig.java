package com.springbootmvc2.security;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.springbootmvc2.service.CustomUserDetailService;


@Configuration
public class SecurityConfig {
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService detailsService() {
		return new CustomUserDetailService();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http
				.authorizeHttpRequests(auth->
				auth.requestMatchers("/","/about","/contact").permitAll()
				.anyRequest().authenticated()
				)
				
				.formLogin(form -> form
			            .loginPage("/login")                // URL of your custom login page
			            .loginProcessingUrl("/perform_login") // URL to submit username/password
			            .defaultSuccessUrl("/students", true) // Redirect after successful login
			            .failureUrl("/login?error=true")    // Redirect on login failure
			            .permitAll()
			        )
				
				.logout(logout -> logout
			            .logoutUrl("/logout")
			            .logoutSuccessUrl("/login?logout=true")
			            .permitAll()
			        )
		
		.build();
}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setPasswordEncoder(encoder());
		provider.setUserDetailsService(detailsService());
		return provider;
	}
	
	
	
}
