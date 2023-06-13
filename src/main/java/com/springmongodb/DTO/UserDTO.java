package com.springmongodb.DTO;

import java.io.Serializable;

import com.springmongodb.domain.User;

public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 2269586328383522536L;
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO() {}

	public UserDTO(User user) {

		this.id = user.getId();
		this.name = user.getname();
		this.email = user.getEmail();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
