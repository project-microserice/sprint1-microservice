package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AuthClientDetails;

public interface AuthClientRepository extends JpaRepository<AuthClientDetails, String> {
	Optional<AuthClientDetails> findByClientId(String clientId);
}
