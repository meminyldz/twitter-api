package com.workintech.twitter_api.controller.request;

import com.workintech.twitter_api.dto.UserDTO;

public class UserRequest {

    private UserDTO userDTO;

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
