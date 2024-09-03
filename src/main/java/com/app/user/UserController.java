package com.app.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/welcome")
    public String welcomeMessage(){
        return " welcome to userController page";
    }
}
