package com.example.ms_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class MsClientApplication {

	@Autowired
	private Environment env;

	@Value("${hi}")
	private String hello;

	public static void main(String[] args) {
		SpringApplication.run(MsClientApplication.class, args);
	}

	@GetMapping("/env-detail")
	public String detail() {
		return env.toString();
	}

	@GetMapping("/hello")
	public String hello() {
		return hello;
	}

}
