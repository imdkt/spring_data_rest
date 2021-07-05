package com.data.rest;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name ="books_collection")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String content;
    private String author;
    private Integer pages;



}
