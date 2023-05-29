package com.microservices.repository;

import com.microservices.entity.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserCredentialRepository  extends JpaRepository<UserCredential,Long> {
    Optional<UserCredential> findByName(String name);
    Optional<UserCredential> findByUsername(String username);
}
