//package com.example.GBSFOtest.service;
//
//import com.example.GBSFOtest.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScans;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//@Component
//@ComponentScan("com/example/GBSFOtest/service")
//@Service
////@EnableJpaRepositories
//public class UserService implements UserDetailsService {
//    @PersistenceContext
//    private EntityManager em;
//    @Autowired
//    UserRepository userRepository;
////    @Autowired
////    BCryptPasswordEncoder passwordEncoder;
////@Bean
//  public PasswordEncoder passwordEncoder(){
//    return new BCryptPasswordEncoder(12);
//}
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(userName);
//
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//
//        return user;
//    }
//
//    public boolean saveUser(User user) {
//        User userFromDB = userRepository.findByUsername(user.getUsername());
//
//        if (userFromDB != null) {
//            return false;
//        }
//        user.setPassword(passwordEncoder().encode(user.getPassword()));
//        userRepository.save(user);
//        return true;
//    }
//}
