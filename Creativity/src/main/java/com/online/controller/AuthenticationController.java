package com.online.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.model.Authentication;

@RestController
@RequestMapping(value = "/auth")
public class AuthenticationController {

	@PostMapping(value = "/login")
	public List<String> authentication(@RequestBody Authentication authentication) {
		System.out.println("calling authenticatio "+ authentication.getUsername());
		List ls = new ArrayList();
		ls.add("Success");

		return ls;

	}

}
