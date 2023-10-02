package com.example.reachnou_lab1.controller;

import com.example.reachnou_lab1.model.Book;
import com.example.reachnou_lab1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(path = "/get-all")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

}
