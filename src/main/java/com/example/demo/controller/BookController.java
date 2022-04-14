package com.example.demo.controller;

import com.example.demo.bean.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/getallbooks")
    List<Book> getBook(){
        List<Book> bookList =   bookService.getBookAllBook();
        return bookList;
    }

    @GetMapping("/getbook/{bookid}")
    Book getBook(@PathVariable("bookid") long bookid)  {
        return bookService.getBook(bookid);
    }

    @PostMapping("/addbook")
    Book addBook(@RequestBody Book book){
      return bookService.addBook(book);
    }

    @PutMapping("/updatebook")
    Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping("/deletebook/{bookid}")
    void deleteBook(@PathVariable("bookid") long bookid)  {
         bookService.deleteBook(bookid);
    }
}
