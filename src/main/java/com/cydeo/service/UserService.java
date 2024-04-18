package com.cydeo.service;

import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;

import java.util.List;

public interface UserService {

    UserDTO save(UserDTO user);
    UserDTO findById(String username);
    List<UserDTO> findall();
    void deleteById (String username);
}
