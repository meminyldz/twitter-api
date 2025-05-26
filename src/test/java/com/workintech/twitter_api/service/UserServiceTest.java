package com.workintech.twitter_api.service;

import com.workintech.twitter_api.dao.UserRepository;
import com.workintech.twitter_api.dto.UserDTO;
import com.workintech.twitter_api.dto.UserResponseDTO;
import com.workintech.twitter_api.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @Mock
    private UserRepository  repository;

    @Test
    void save() {

        UserDTO userDTO = new UserDTO();
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        User user = new User();
        user.setUserName("Test");
        user.setId(5L);

        Mockito.when(repository.save(any(User.class))).thenReturn(user);
        userResponseDTO = userServiceImpl.save(userDTO);

        assertEquals(userResponseDTO.getUserId(),5L);

    }

    @Test
    void testSave() {
    }
}