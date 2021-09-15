package com.lucas.costa.bookstoragemanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BookstoragemanageApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoragemanageApplication.class, args);
	}

}

