package com.edu.escuelaing.arep.AREPSecureLab.service;

/**
 *
 */
public interface SecurityService {

    /**
     *
     * @return
     */
    String findLoggedInUsername();

    /**
     *
     * @param username
     * @param password
     */
    void autoLogin(String username, String password);
}
