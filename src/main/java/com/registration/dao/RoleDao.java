
package com.registration.dao;

import com.registration.entity.Role;

import java.util.List;

public interface RoleDao {

    List<Role> getAllUsers();

    Role getRoleById(int roleId);

    boolean addRole(Role role);

    boolean roleExists(String roleName);
}
