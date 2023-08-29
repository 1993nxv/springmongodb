package com.springmongodb.DTO;

import java.io.Serializable;

import com.springmongodb.domain.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 2269586328383522536L;
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
	}
	
}
