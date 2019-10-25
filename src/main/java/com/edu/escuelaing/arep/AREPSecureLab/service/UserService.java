package com.edu.escuelaing.arep.AREPSecureLab.service;

import com.edu.escuelaing.arep.AREPSecureLab.model.User;

/**
 *
 */
public interface UserService {

    /**
     *
     * @param user
     */
    void save (User user);

    /**
     *
     * @param username
     * @return
     */
    User findByUsername(String username);

}
