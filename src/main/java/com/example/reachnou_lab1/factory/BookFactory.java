package com.example.reachnou_lab1.factory;

import com.example.reachnou_lab1.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookFactory {

    public static List<Book> books = new ArrayList<>();

    public static List<Book> getAllBooks(){
        return books;
    }

    public static void generateBook(){
        books.add(new Book(1, "WAA", "123"));
        books.add(new Book(2, "EA", "345"));
        books.add(new Book(3, "WAP", "567"));
    }
}
