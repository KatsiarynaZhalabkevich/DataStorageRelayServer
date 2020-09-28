package com.github.zhalabkevich.validation.controller;

import com.github.zhalabkevich.validation.model.State;
import com.github.zhalabkevich.validation.model.User;
import com.github.zhalabkevich.validation.proxy.FeignCarProxy;
import com.github.zhalabkevich.validation.proxy.UserFeignProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class Controller {
    private final static String ERROR_MESSAGE = " Please log in  http:// localhost:8080/user/login " +
            "\n or sign up http:// localhost:8080/user/signup";

    private final UserFeignProxy userFeignProxy;
    private final FeignCarProxy feignCarProxy;


    public Controller(UserFeignProxy userFeignProxy, FeignCarProxy feignCarProxy) {
        this.userFeignProxy = userFeignProxy;
        this.feignCarProxy = feignCarProxy;
    }

    @PostMapping("/user/signup")
    public ResponseEntity<?> signUp(@RequestBody User user) {
        return userFeignProxy.addNewUser(user);
    }

    @PostMapping("/user/login")
    public ResponseEntity<?> login(@RequestBody User user, HttpServletRequest request) {
        return userFeignProxy.authorize(user, request);
    }

    @PostMapping("/user/logout")
    public ResponseEntity<?> logout(HttpServletRequest request, HttpServletResponse response) {
        return userFeignProxy.logout(request, response);
    }


    @GetMapping("/api/cars")
    public ResponseEntity<?> getCars(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return feignCarProxy.getCars();
        } else {
            return new ResponseEntity<>(ERROR_MESSAGE, HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("/api/cars/{id}")
    public ResponseEntity<?> getCarById(@PathVariable Long id, HttpSession session) {
        if (session.getAttribute("user") != null) {
            return feignCarProxy.getCarById(id);
        } else {
            return new ResponseEntity<>(ERROR_MESSAGE, HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("api/cars/tenant/{id}")
    public ResponseEntity<?> getCarsByTenantId(@PathVariable Long id, HttpSession session) {
        if (session.getAttribute("user") != null) {
            return feignCarProxy.getCarsByTenantId(id);
        } else {
            return new ResponseEntity<>(ERROR_MESSAGE, HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("api/cars/brands")
    ResponseEntity<?> getBrands(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return feignCarProxy.getBrands();
        } else {
            return new ResponseEntity<>(ERROR_MESSAGE, HttpStatus.FORBIDDEN);
        }
    }


    @GetMapping("api/cars/brands/{id}")
    ResponseEntity<?> getBrandModels(@PathVariable Long id, HttpSession session) {
        if (session.getAttribute("user") != null) {
            return feignCarProxy.getBrandModels(id);
        } else {
            return new ResponseEntity<>(ERROR_MESSAGE, HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("/tenant")
    ResponseEntity<?> getTenants(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return feignCarProxy.getTenants();
        } else {
            return new ResponseEntity<>(ERROR_MESSAGE, HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("/tenant/{id}")
    ResponseEntity<?> getTenantById(@PathVariable Long id, HttpSession session) {
        if (session.getAttribute("user") != null) {
            return feignCarProxy.getTenantById(id);
        } else {
            return new ResponseEntity<>(ERROR_MESSAGE, HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("/stat/here")
    public ResponseEntity<?> getCarsOnTerritory(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return feignCarProxy.getCarsOnTerritory();
        } else {
            return new ResponseEntity<>(ERROR_MESSAGE, HttpStatus.FORBIDDEN);
        }
    }

    @PostMapping("/stat/add")
    public ResponseEntity<?> addCarArrive(@RequestBody State state, HttpSession session){
        if (session.getAttribute("user") != null) {
            return feignCarProxy.addCarArrive(state);
        } else {
            return new ResponseEntity<>(ERROR_MESSAGE, HttpStatus.FORBIDDEN);
        }
    }

    @PutMapping("/stat/add")
    public ResponseEntity<?> addCarDeparture(@RequestBody State state, HttpSession session){
        if (session.getAttribute("user") != null) {
            return feignCarProxy.addCarDeparture(state);
        } else {
            return new ResponseEntity<>(ERROR_MESSAGE, HttpStatus.FORBIDDEN);
        }
    }
}
