/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:4/17/2023
 * Time:5:53 PM
 * Project Name:spring-boot-docker
 */
package com.example.controller;

import com.example.service.UserService;
import com.example.domain.template.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody UserRequest request) {
        return ResponseEntity.status(201).body(userService.save(request));
    }

    @GetMapping("/list")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }
}
