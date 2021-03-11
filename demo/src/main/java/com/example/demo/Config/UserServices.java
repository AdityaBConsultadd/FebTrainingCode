//package com.example.demo.Config;
//
//import com.example.demo.Model.User;
//import com.example.demo.Repo.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServices implements UserDetailsService {
//    @Autowired
//    private UserRepo userRepo;
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        User user = userRepo.findByUsername(s);
//        if(user == null)
//            throw  new UsernameNotFoundException(s);
//        return new UserDetails1(user);
//    }
//}
