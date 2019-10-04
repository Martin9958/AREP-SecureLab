package com.edu.escuelaing.arep.AREPSecureLab.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredServerController {
    Integer counter = 0;

    @RequestMapping("/secured")
    public String secured(){
        counter+=1;
        return "Hello User" + counter;
    }

}
