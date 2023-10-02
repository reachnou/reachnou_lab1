package com.example.reachnou_lab1;

import com.example.reachnou_lab1.factory.BookFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReachNouLab1Application {

    public static void main(String[] args) {
        SpringApplication.run(ReachNouLab1Application.class, args);
        BookFactory.generateBook();
    }

}
