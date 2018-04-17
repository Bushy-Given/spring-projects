package com.bushy.springmongo.userRepository;

import com.bushy.springmongo.docs.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepo  extends MongoRepository<User,Long>{
    Optional<User> findById(String id);
}
