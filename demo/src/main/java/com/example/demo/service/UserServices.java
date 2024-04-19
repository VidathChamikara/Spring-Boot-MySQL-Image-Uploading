package com.example.demo.service;

import com.example.demo.dto.UserCreateDto;
import org.springframework.web.multipart.MultipartFile;

public interface UserServices {
    UserCreateDto createUser(UserCreateDto userCreateDto, MultipartFile profileImage);


}


