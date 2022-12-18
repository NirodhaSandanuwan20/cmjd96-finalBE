package com.youtube.cmjdFinal.service;

import com.youtube.cmjdFinal.dao.RoleDao;
import com.youtube.cmjdFinal.entity.Role;
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
