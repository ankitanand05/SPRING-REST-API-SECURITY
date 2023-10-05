//package com.luv2code.springboot.cruddemo.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class DemoSecurityConfig {
//    @Bean
//    public InMemoryUserDetailsManager userDetailsManager(){
//        UserDetails ankit = User.builder().username("ankit").password("{noop}ankit123").roles("EMPLOYEE").build();
//        UserDetails  yash = User.builder().username("yash").password("{noop}yash123").roles("EMPLOYEE","MANAGER").build();
//        UserDetails rajesh = User.builder().username("rajesh").password("{noop} rajesh123").roles("EMPLOYEE","MANAGER","ADMIN").build();
//        return new InMemoryUserDetailsManager(ankit,yash,rajesh);
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//        http.authorizeHttpRequests(configurer ->
//           configurer
//                   .requestMatchers(HttpMethod.GET,"/api/employees").hasRole("EMPLOYEE")
//                   .requestMatchers(HttpMethod.GET,"/api/employees/**").hasRole("EMPLOYEE")
//                   .requestMatchers(HttpMethod.POST,"/api/employees").hasRole("MANAGER")
//                   .requestMatchers(HttpMethod.PUT,"/api/employees").hasRole("MANAGER")
//                   .requestMatchers(HttpMethod.DELETE,"/api/employees/**").hasRole("ADMIN"));
//
//        //Use Https basic authentication
//
//
//        http.httpBasic(Customizer.withDefaults());
//
//        //Disable Cross Site Request Forgery(CSRF)
//        //In General, not required for stateless Rest APIs that use POST,PUT,DELETE and/or PATCH
//        http.csrf(csrf->csrf.disable());
//        return http.build();
//    }
//}
