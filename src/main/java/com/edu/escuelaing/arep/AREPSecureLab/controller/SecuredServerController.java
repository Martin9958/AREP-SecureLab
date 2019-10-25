package com.edu.escuelaing.arep.AREPSecureLab.controller;

import com.edu.escuelaing.arep.AREPSecureLab.model.User;
import com.edu.escuelaing.arep.AREPSecureLab.service.SecurityService;
import com.edu.escuelaing.arep.AREPSecureLab.service.UserService;
import com.edu.escuelaing.arep.AREPSecureLab.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredServerController {

    /**
     *
     */
    @Autowired
    private UserService userService;

    /**
     *
     */
    @Autowired
    private SecurityService securityService;

    /**
     *
     */
    @Autowired
    private UserValidator userValidator;

    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    /**
     *
     * @param userForm
     * @param bindingResult
     * @return
     */
    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }

    /**
     *
     * @param model
     * @param error
     * @param logout
     * @return
     */
    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    /**
     *
     * @param model
     * @return
     */
    @GetMapping({"/", "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }

}
