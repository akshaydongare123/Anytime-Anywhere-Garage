package com.project;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.project.Moto-Spa"})
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MotoSpa {

//	@Autowired
//	private UserServiceImpl userService;
	
		public static void main(String[] args) {
		SpringApplication.run(MotoSpa.class, args);
	}
	
		@Bean
		public ModelMapper modelMapper() {
			return new ModelMapper();
		}

}
