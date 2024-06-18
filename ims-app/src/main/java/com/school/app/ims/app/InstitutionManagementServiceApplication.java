package com.school.app.ims.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.school.app.*", "com.school.app.ims.primary.adapter.*"})
public class InstitutionManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstitutionManagementServiceApplication.class, args);
	}

}
