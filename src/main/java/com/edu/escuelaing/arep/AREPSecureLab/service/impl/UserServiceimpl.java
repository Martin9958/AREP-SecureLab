package com.edu.escuelaing.arep.AREPSecureLab.service.impl;

import java.util.HashSet;

import com.edu.escuelaing.arep.AREPSecureLab.model.User;
import com.edu.escuelaing.arep.AREPSecureLab.repository.RoleRepository;
import com.edu.escuelaing.arep.AREPSecureLab.repository.UserRepository;
import com.edu.escuelaing.arep.AREPSecureLab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {

    /**
     *
     */
    @Autowired
    private UserRepository userRepository;

    /**
     *
     */
    @Autowired
    private RoleRepository roleRepository;

    /**
     *
     */
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    /**
     *
     */
    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    /**
     *
     */
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
