package com.workintech.twitter_api.controller.response;

import com.workintech.twitter_api.dto.UserResponseDTO;

public class UserResponse {

    private UserResponseDTO userResponseDTO;

    public UserResponseDTO getUserResponseDTO() {
        return userResponseDTO;
    }

    public void setUserResponseDTO(UserResponseDTO userResponseDTO) {
        this.userResponseDTO = userResponseDTO;
    }
}
