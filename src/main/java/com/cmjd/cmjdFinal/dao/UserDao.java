package com.cmjd.cmjdFinal.dao;

import com.cmjd.cmjdFinal.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
