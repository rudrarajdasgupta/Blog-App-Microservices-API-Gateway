package com.microservices.feign.apis;

import java.util.List;

import com.microservices.entity.UserCredential;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="user-service")
public interface UserAPI {
	@PostMapping("/users")
	public ResponseEntity<UserCredential> createUser(@RequestBody UserCredential user);
}
