package com.assignmentMvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignmentMvc.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
