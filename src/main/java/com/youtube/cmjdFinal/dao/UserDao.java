package com.youtube.cmjdFinal.dao;

import com.youtube.cmjdFinal.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
