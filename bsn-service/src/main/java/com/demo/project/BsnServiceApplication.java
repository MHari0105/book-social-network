package com.demo.project;

import com.demo.project.repository.RoleRepository;
import com.demo.project.user.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@SpringBootApplication
@EnableAsync
public class BsnServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BsnServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(RoleRepository roleRepo) {
		return args -> {
			if (roleRepo.findByName("USER").isEmpty()) {
				roleRepo.save(Role.builder().name("USER").build());
			}
		};
	}

}
