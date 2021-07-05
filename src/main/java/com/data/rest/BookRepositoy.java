package com.data.rest;


import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepositoy extends JpaRepository<Book, Integer> {


}
