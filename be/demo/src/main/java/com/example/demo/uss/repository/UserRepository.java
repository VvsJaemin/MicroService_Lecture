package com.example.demo.uss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;

interface UserCustomRepository{
	
}
public interface UserRepository extends JpaRepository<User, Long>, 
										UserCustomRepository {
	
}
