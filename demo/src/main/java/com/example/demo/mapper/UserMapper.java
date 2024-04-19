package com.example.demo.mapper;
import com.example.demo.dto.UserCreateDto;
import com.example.demo.entity.User;

public class UserMapper {

    public static UserCreateDto mapToUserCreateDto(User user) {
        return new UserCreateDto(
                user.getUserName(),
                user.getPassword(),
                user.getProfilePicUrl()
        );
    }

    public static User mapToUser(UserCreateDto userCreateDto) {
        return new User(
                userCreateDto.getUserName(),
                userCreateDto.getPassword(),
                userCreateDto.getProfilePicUrl()
        );
    }
}
