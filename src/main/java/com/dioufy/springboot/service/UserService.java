package com.dioufy.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.dioufy.springboot.model.User;
import com.dioufy.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto userRegistrationDto);
}
