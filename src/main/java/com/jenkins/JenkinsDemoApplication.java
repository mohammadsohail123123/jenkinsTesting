package com.jenkins;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsDemoApplication {

@RequestMapping("/test")
public String test() {
	return "jenkins running";
}

@PostConstruct
public void init() {
	System.out.println("jenkin sup");
	System.out.println("jenkin sup11");
	System.out.println("jenkin sup12");
}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
