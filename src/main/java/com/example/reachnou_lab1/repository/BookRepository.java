package com.example.reachnou_lab1.repository;

import com.example.reachnou_lab1.factory.BookFactory;
import com.example.reachnou_lab1.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    public List<Book> getAllBooks(){
        return BookFactory.getAllBooks();
    }

}
