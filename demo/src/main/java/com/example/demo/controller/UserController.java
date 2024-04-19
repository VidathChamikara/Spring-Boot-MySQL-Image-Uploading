package com.example.demo.controller;

import com.example.demo.dto.UserCreateDto;
import com.example.demo.service.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
@AllArgsConstructor
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/create")
    public ResponseEntity<UserCreateDto> createUser(@ModelAttribute UserCreateDto userCreateDto,
                                                    @RequestParam("profileImage") MultipartFile profileImage) {
        UserCreateDto createdUser = userServices.createUser(userCreateDto, profileImage);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
}

