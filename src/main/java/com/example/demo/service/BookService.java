package com.example.demo.service;

import com.example.demo.bean.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public List<Book> getBookAllBook(){
        List<Book> booklist = new ArrayList<Book>();
        repository.findAll().forEach(x -> booklist.add(x));
        return booklist;
    }
}
