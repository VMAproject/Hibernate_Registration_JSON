package com.registration.service;

import com.registration.model.Role;

import java.util.List;


public interface RoleService {

    List<Role> getAllUsers();

    Role getRoleById(int roleId);

    boolean addRole(Role role);

    boolean roleExists(String roleName);
}
