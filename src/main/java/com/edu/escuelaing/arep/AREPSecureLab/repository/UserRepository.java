package com.edu.escuelaing.arep.AREPSecureLab.repository;

import com.edu.escuelaing.arep.AREPSecureLab.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
