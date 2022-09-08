package com.hoaxify.user;

import com.hoaxify.shared.GenericReponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/api/1.0/users")
    GenericReponse createUser(@RequestBody Users user){
        userService.save(user);
        return new GenericReponse("User saved");
    }
}
