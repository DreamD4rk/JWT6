package com.example.entity;

import com.example.util.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "\"user\"")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	private Long id;
	
	private String username;
	
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Role role;

}
