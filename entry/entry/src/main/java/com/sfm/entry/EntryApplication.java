package com.sfm.entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class EntryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntryApplication.class, args);
	}

}
