package com.housney.lolvs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.housney.lolvs"})
public class LolvsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LolvsApplication.class, args);
	}

}
