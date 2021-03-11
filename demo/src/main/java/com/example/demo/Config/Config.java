//package com.example.demo.Config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//@EnableWebSecurity
//public class Config extends WebSecurityConfigurerAdapter {
//    @Autowired
//    UserDetailsService userDetailsService;
//    @Bean
//    AuthenticationProvider authenticationProvider(){
//        DaoAuthenticationProvider daoAuthenticationProvider= new DaoAuthenticationProvider();
//        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
//        daoAuthenticationProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//        return daoAuthenticationProvider;
//    }
//
//
//
////    @Bean
////    @Override
////    protected UserDetailsService userDetailsService(){
////        List<UserDetails> user = new ArrayList<>();
////        user.add(User.withDefaultPasswordEncoder().username("root").password("aditya").roles("USER").build());
////        user.add(User.withDefaultPasswordEncoder().username("user").password("aditya").roles("USER").build());
////        return new InMemoryUserDetailsManager(user);
////    }
//}
