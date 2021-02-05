package com.googhcl.hellojwt.dao;

import com.googhcl.hellojwt.model.DAOUser;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<DAOUser, Long> {
    DAOUser findByUsername(String username);
}
