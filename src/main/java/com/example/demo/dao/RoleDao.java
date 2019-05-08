package com.example.demo.dao;

import com.example.demo.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoleDao {
//    @Select("select * from smbms_role")
    List<Role> findAllRole();

    Role findRoleById(@Param("roleId") int roleId);

    int addRole(Role role);

    int updateRole(Role role);

    int delRole(@Param("roleId") int roleId);
}
