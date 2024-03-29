package com.springmongodb.DTO;

import java.io.Serializable;

import com.springmongodb.domain.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthorDTO implements Serializable {

	private static final long serialVersionUID = -7200048829114264735L;
	
	private String id;
	private String name;
	
	public AuthorDTO(User user) {
		this.id = user.getId();
		this.name = user.getName();
	}
}
