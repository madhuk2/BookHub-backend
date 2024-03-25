package com.bookhub.BookHub.controller;

import com.bookhub.BookHub.entity.User;
import com.bookhub.BookHub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("user")
public class UserController {
@Autowired
    private UserService userService;
@PostMapping("signUpOrUpdate")
    public void signupOrUpdate(@RequestBody User user) {
        userService.signupOrUpdate(user);
    }
}
