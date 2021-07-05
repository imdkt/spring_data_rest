package com.data.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private BookRepositoy bookRepositoy;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book = new Book();
		book.setTitle("my First Book");
		book.setContent("First Content");

		Book book1 = new Book();
		book1.setTitle("My Second book");
		book1.setContent("Second Content");

		this.bookRepositoy.save(book);
		this.bookRepositoy.save(book1);









	}
}
