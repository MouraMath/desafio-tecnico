package com.example.demo.Repository;

public interface UserRepository extendsJpaRepository<User, Long> {
	User findByUsername(String username);
}
