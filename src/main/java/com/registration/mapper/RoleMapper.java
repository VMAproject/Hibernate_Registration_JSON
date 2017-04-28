/**
 * 
 */
package com.registration.mapper;


import com.registration.entity.Role;

import java.util.List;


public interface RoleMapper {
	
	List<Role> getAllUsers();
	Role getRoleById(int roleId);
	boolean addRole(Role role);
	boolean roleExists(String roleName);
}
