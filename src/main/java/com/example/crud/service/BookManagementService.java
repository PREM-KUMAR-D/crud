package com.example.crud.service;

import com.example.crud.entity.Book;
import com.example.crud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookManagementService {
    @Autowired
    BookRepository bookRepository;

    public Book storeBook(Book book) {
        return bookRepository.save(book);
    }

    public ResponseEntity<Book> getBookById(Long id) {
        Optional<Book> savedBook = bookRepository.findById(id);
        return ResponseEntity.ok(savedBook.get());
    }
}
