package com.github.zhalabkevich.registration.rest;

import com.github.zhalabkevich.registration.model.User;
import com.github.zhalabkevich.registration.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/user")
public class RegistrationRestController {
    private final UserService userService;

    public RegistrationRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> addNewUser(@RequestBody User user) {
        User newUser = userService.addUser(user);
        //redirect to login
        return newUser != null ? new ResponseEntity<>(newUser, HttpStatus.OK) //create session and save info????
                : new ResponseEntity<>("Email is not unique", HttpStatus.FORBIDDEN);

    }

    @PostMapping("/logout") //Spring Security was used
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        SecurityContextLogoutHandler securityContextLogoutHandler = new SecurityContextLogoutHandler();
        securityContextLogoutHandler.logout(request, response, null);
    }

    @PostMapping("/login")
    public ResponseEntity<?> authorize(@RequestBody User user, HttpServletRequest request) {
        User userFromDB = userService.authorizeUser(user);
        if (userFromDB != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", userFromDB); //
            return new ResponseEntity<>(session, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Invalid email/password combination", HttpStatus.FORBIDDEN);
        }

    }
}
