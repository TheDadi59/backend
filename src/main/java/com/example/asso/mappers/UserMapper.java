package com.example.asso.mappers;

import com.example.asso.entity.User;
import com.example.asso.dtos.SignUpDto;
import com.example.asso.dtos.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
