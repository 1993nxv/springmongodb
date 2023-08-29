package com.springmongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodb.DTO.UserDTO;
import com.springmongodb.domain.User;
import com.springmongodb.repository.UserRepository;
import com.springmongodb.service.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User user) {
		return userRepository.insert(user);
	}
	public void delete(String id) {
		findById(id);
		userRepository.deleteById(id);
	}
	
	public User update(User userUpdate) {
		User newUser = findById(userUpdate.getId());
		updateData(newUser, userUpdate);
		return userRepository.save(newUser);
	}
	
	private void updateData(User newUser, User userUpdate) {
		newUser.setName(userUpdate.getName());
		newUser.setEmail(userUpdate.getEmail());
	}

	public User fromDTO(UserDTO userDTO) {
		return new User(
			userDTO.getId(),
			userDTO.getName(),
			userDTO.getEmail()
		);
	}
	
}
