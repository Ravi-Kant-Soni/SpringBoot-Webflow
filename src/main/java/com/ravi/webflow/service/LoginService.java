package com.ravi.webflow.service;

import org.springframework.stereotype.Service;

import com.ravi.webflow.dto.LoginDTO;

@Service
public class LoginService {

	public String validateUser(LoginDTO loginDTO) {
		String userName = loginDTO.getUserName();
		String password = loginDTO.getPassword();
		if (userName.equals("Ravi") && password.equals("Password")) {
			return "true";
		} else {
			return "false";
		}
	}

}
