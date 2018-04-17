package com.bushy.springmongo.userService;

import com.bushy.springmongo.docs.User;
import com.bushy.springmongo.userRepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public Optional<User> findUserbyId(Long id){
        return userRepo.findById(id);
    }


}
