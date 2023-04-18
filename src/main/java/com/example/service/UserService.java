/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:4/17/2023
 * Time:5:55 PM
 * Project Name:spring-boot-docker
 */
package com.example.service;

import com.example.repo.UserRepository;
import com.example.domain.User;
import com.example.domain.template.UserRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(UserRequest request) {
        User user = new User();
        user.setFirstname(request.getFirstname());
        user.setLastname(request.getLastname());
        user.setUsername(request.getUsername());

        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
