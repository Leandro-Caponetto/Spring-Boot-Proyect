package com.leandro.curso.springboot.webapp.sprinbootweb.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leandro.curso.springboot.webapp.sprinbootweb.models.User;
import com.leandro.curso.springboot.webapp.sprinbootweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        User user = new User("Leandro", "Caponetto");
        UserDto userDto = new UserDto();

        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Coco", "Ramirez");
        User user2 = new User("Pepe", "Lopez");
        User user3 = new User("Ramon", "Perez");

        List<User> users = Arrays.asList(user, user2, user3);

        return users;
    }

    @GetMapping("/detailsMap")
    public Map<String, Object> detailsMap() {
        User user = new User("Leandro", "Caponetto");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);

        return body;
    }

}
