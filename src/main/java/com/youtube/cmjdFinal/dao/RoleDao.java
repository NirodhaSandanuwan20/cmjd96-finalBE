package com.youtube.cmjdFinal.dao;

import com.youtube.cmjdFinal.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
