package com.example.demo.service;

import com.example.demo.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAllRole();

    Role findRoleById(int roleId);

    int addRole(Role role);

    int updateRole(Role role);

    int delRole(int roleId);
}
