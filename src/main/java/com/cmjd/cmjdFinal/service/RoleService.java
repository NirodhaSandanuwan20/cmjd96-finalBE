package com.cmjd.cmjdFinal.service;

import com.cmjd.cmjdFinal.dao.RoleDao;
import com.cmjd.cmjdFinal.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
