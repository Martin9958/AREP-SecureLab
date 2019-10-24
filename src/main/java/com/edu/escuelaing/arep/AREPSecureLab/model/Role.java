package com.edu.escuelaing.arep.AREPSecureLab.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 *
 */
@Getter
@Setter
@Entity
@Table(name = "role")
public class Role {

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
