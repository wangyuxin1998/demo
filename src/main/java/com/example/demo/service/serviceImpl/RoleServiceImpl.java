package com.example.demo.service.serviceImpl;

import com.example.demo.dao.RoleDao;
import com.example.demo.entity.Role;
import com.example.demo.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleDao roleDao;

    @Override
    public List<Role> findAllRole() {
        return roleDao.findAllRole();
    }

    @Override
    public Role findRoleById(int roleId) {
        return roleDao.findRoleById(roleId);
    }

    @Override
    public int addRole(Role role) {
        return roleDao.addRole(role);
    }

    @Override
    public int updateRole(Role role) {
        return roleDao.updateRole(role);
    }

    @Override
    public int delRole(int roleId) {
        return roleDao.delRole(roleId);
    }
}
