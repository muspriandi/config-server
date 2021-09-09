package com.example.ms_config;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@EnableEncryptableProperties
@RestController
public class MsConfigApplication {

	@Value("${hi}")
	private String hello;

	public static void main(String[] args) {
		SpringApplication.run(MsConfigApplication.class, args);
	}


	@GetMapping("/hello")
	public String hello() {
		return hello;
	}
	


}
