package com.springmongodb.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.springmongodb.DTO.AuthorDTO;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Document(collection="POST")
public class Post implements Serializable{
	
	private static final long serialVersionUID = -5870852689207299969L;
	
	@Id
	private String id;
	private Date date;
	private String title;
	private String body;
	private AuthorDTO author;
	
}
