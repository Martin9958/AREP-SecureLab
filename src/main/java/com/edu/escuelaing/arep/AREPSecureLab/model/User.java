package com.edu.escuelaing.arep.AREPSecureLab.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

/**
 *
 */
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *
     */
    private String username;

    /**
     *
     */
    private String password;

    /**
     *
     */
    @Transient
    private String passwordConfirm;

    /**
     *
     */
    @ManyToMany
    private Set<Role> roles;

}
