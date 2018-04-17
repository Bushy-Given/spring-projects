package com.bushy.springmongo.userController;

import com.bushy.springmongo.docs.User;
import com.bushy.springmongo.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "mongo/api/")
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(path = "users")
    public Iterable<User> findAllUSers(){
        return userService.getAllUsers();
    }

    @GetMapping(path = "userid/{userId}")
    public Optional<User> getUserById(@PathVariable String userId){
         return userService.findUserbyId(userId);
    }
}
