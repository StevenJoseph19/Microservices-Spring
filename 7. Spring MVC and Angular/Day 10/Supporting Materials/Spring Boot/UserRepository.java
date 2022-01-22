package com.springbootangular.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootangular.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}
