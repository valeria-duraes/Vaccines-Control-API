package com.group_vaccineapi.artifact_vaccineapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class NameVaccineapiApplication {

	public static void main(String[] args) {
        SpringApplication.run(NameVaccineapiApplication.class, args);
	}

}
