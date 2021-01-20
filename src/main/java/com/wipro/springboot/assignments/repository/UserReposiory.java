package com.wipro.springboot.assignments.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.wipro.springboot.assignments.model.User;

public interface UserReposiory extends JpaRepository<User, Integer> {

	User findByUserName(String username);

}
