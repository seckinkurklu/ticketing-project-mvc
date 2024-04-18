package com.cydeo.service;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;

import java.util.List;

public interface RoleService {

    RoleDTO save(RoleDTO user);

    RoleDTO findById(Long id);

    List<RoleDTO> findall();
    void deleteById (Long id);


}
