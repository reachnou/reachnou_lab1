package com.example.reachnou_lab1.service;

import com.example.reachnou_lab1.model.Book;
import com.example.reachnou_lab1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.getAllBooks();
    }
}
