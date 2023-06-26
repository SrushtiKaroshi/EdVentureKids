package com.edventurekids.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.edventurekids.school.repository")
@EntityScan("com.edventurekids.school.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")

public class EdVentureKidsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdVentureKidsApplication.class, args);
	}

}


