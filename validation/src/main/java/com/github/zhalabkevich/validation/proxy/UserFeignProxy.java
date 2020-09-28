package com.github.zhalabkevich.validation.proxy;

import com.github.zhalabkevich.validation.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@FeignClient(name = "registration-server", url = "localhost:8001")
@RequestMapping("/user")
public interface UserFeignProxy {
    @PostMapping("/signup")
    ResponseEntity<?> addNewUser(@RequestBody User user);

    @PostMapping("/logout")
    ResponseEntity<?> logout(HttpServletRequest request, HttpServletResponse response);

    @PostMapping("/login")
    ResponseEntity<?> authorize(@RequestBody User user, HttpServletRequest request);

}


