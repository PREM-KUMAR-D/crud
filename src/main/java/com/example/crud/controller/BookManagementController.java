package com.example.crud.controller;

import com.example.crud.entity.Book;
import com.example.crud.service.BookManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookManagementController {

    @Autowired
    BookManagementService bookManagementService;

    @PostMapping("/new")
    public ResponseEntity<Book> createNewBook(@RequestBody Book book){
        Book newBook = bookManagementService.storeBook(book);
        return ResponseEntity.ok(newBook);
    }

}
