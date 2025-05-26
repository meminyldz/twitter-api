package com.workintech.twitter_api.controller;


import com.workintech.twitter_api.controller.request.UserRequest;
import com.workintech.twitter_api.controller.response.UserResponse;
import com.workintech.twitter_api.dto.UserResponseDTO;
import com.workintech.twitter_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public UserResponse saveTweet(@RequestBody UserRequest request){
        UserResponse response = new UserResponse();
        UserResponseDTO dto = userService.save(request.getUserDTO());
        response.setUserResponseDTO(dto);
        return response;
    }

    @PostMapping("/getIdByEmail")
    public UserResponse getIdByEmail(@RequestBody String email){
        UserResponse response = new UserResponse();
        UserResponseDTO dto = userService.getUserByEmail(email);
        response.setUserResponseDTO(dto);
        return response;
    }

}
