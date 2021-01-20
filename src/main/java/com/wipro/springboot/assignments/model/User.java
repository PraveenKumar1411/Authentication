package com.wipro.springboot.assignments.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class User {

	@Id
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	
	//private boolean enabled;
	
	
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*
	 * public boolean isEnabled() { return enabled; } public void setEnabled(boolean
	 * enabled) { this.enabled = enabled; }
	 */
	
}
