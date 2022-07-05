package com.example.seniorsHospital;

import model.Doctor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SeniorsHospitalApplication {

	public static void main(String[] args) {

		SpringApplication.run(SeniorsHospitalApplication.class, args);
	}
	Doctor doctor=new Doctor();

	@GetMapping("/")
	public String asd() {
		doctor.setEmail("mustafa@hotmail.com");
		return doctor.getEmail();
	}

}
