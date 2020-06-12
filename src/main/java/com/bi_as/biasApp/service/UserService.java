package com.bi_as.biasApp.service;


import com.bi_as.biasApp.dao.UserRepository;
import com.bi_as.biasApp.domain.User;
import com.bi_as.biasApp.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> findAllUser(){
        List<UserDto> UserDtoList = new ArrayList<>();
        for (User user:userRepository.findAll()) {
            UserDtoList.add(new UserDto(user));
        }
        return UserDtoList;
    }
}
