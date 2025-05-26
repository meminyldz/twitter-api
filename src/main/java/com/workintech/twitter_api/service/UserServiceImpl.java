package com.workintech.twitter_api.service;

import com.workintech.twitter_api.dao.UserRepository;
import com.workintech.twitter_api.dto.UserDTO;
import com.workintech.twitter_api.dto.UserResponseDTO;
import com.workintech.twitter_api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserResponseDTO save(UserDTO dto) {
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        User user = new User();
        user.setEmail(dto.getEmail());
        user.setUserName(dto.getUserName());
        user.setPassword(dto.getPassword());
        User insertedUser = repository.save(user);
        userResponseDTO.setUserId(insertedUser.getId());
        userResponseDTO.setSuccess(true);
        return userResponseDTO;
    }

    @Override
    public UserResponseDTO getUserByEmail(String email) {
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        User user = repository.getUserByEmail(email);
        if(user !=null) {
            userResponseDTO.setUserId(user.getId());
            userResponseDTO.setSuccess(true);
        } else {
            userResponseDTO.setSuccess(false);
            userResponseDTO.setMessage("Kullanıcı bulunamadı");
        }
        return userResponseDTO;
    }
}
