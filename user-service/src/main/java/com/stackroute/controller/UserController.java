package com.stackroute.controller;

import com.stackroute.domain.User;
import com.stackroute.dtos.UserDto;
import com.stackroute.dtos.UserMapper;
import com.stackroute.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@RestController

@RequestMapping(value = "api/v1")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private UserService userService;
    private UserMapper userMapper;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("user")
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto){
        userService.saveUser(userMapper.toUser(userDto));

        return ResponseEntity.status(HttpStatus.CREATED).body(userDto);
//        User savedUser=userService.saveUser(user);
//        logger.info("logger.info implemented");
//
//        return new ResponseEntity<>(savedUser,HttpStatus.OK);
    }
    @GetMapping("user/{id}")
    public ResponseEntity<?> getUserByID(@PathVariable int id){
//        User userDetails=userService.getUserById(id);
//        return new ResponseEntity<>(userDetails,HttpStatus.OK);

        Optional<User> user = Optional.ofNullable(userService.getUserById(id));

        return ResponseEntity.ok(userMapper.toUserDto(user.get()));
    }

    @GetMapping("user")
    public ResponseEntity<List<UserDto>> getAllUsers()
    {
//        return ResponseEntity.ok(userMapper.(userService.getAllUsers()));
        return ResponseEntity.ok(userMapper.toUserDtos(userService.getAllUsers()));
    }

}
