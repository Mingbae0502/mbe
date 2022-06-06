package com.mb.mbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages={
		"com.mb.mbe.repository"})
public class MbeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbeApplication.class, args);
	}

}
