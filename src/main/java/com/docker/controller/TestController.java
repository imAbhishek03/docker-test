package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/docker-test")
	public String dockerTest() {
		return "Docker is running....";
	}
}
