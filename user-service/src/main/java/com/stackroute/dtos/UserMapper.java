package com.stackroute.dtos;

import com.stackroute.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {


        UserDto toUserDto(User user);

        List<UserDto> toUserDtos(List<User> users);

        User toUser(UserDto userDto);
    }

