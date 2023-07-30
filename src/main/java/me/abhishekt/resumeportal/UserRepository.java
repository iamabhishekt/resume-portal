package me.abhishekt.resumeportal;

import me.abhishekt.resumeportal.models.User; //package for etch models/user
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    //repository which looks into User model with integer
    Optional<User> findByUserName(String userName);
    //it will give method to get data from setter in models/user username
}
