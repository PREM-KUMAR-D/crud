package com.example.crud.controller;

import com.example.crud.entity.Book;
import com.example.crud.service.BookManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/get/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id){
        return bookManagementService.getBookById(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Book> updateBookById(@PathVariable Long id , @RequestBody Book book){
        return ResponseEntity.ok(bookManagementService.updateBookById(id,book));
    }

}
