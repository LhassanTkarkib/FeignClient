package com.migrationdemo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "user-service")
public interface UserClient {

    @GetMapping("/api/v1/user/getUsers/{userId}")
    UserEntityDto getUsers(@PathVariable Long userId);

    @GetMapping("/api/v1/user/getUsers")
    List<UserEntityDto> getUsers();

    @DeleteMapping("/api/v1/user/deleteUser/{userId}")
    void deleteUser(@PathVariable Long userId);

    @PutMapping("/api/v1/user/updateUser")
    UserEntityDto updateUser(@RequestBody UserEntityDto userDTO);

    @PostMapping("/api/v1/user/createUser")
    UserEntityDto createUser(@RequestBody UserEntityDto userDTO);
}