package com.example.rest_docs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class RestDocsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDocsApplication.class, args);
	}

	@GetMapping("/test")
	public ResponseEntity<?> get () {
		Map<String, String> map = new HashMap<>();
		map.put("message", "hello world");

		return new ResponseEntity<>(map, HttpStatus.OK);
	}
}
