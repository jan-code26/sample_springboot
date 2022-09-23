package com.example.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
@RestController
public class DemosApplication {


	@GetMapping(value = "/resource")
	public  @ResponseBody  Map<String,String> home() {
		Map<String,String> model = new HashMap<>();
		model.put("id","10");
		model.put("content", "Hello World");
		return model;
	}


	public static void main(String[] args) {
		SpringApplication.run(DemosApplication.class, args);
	}

}
