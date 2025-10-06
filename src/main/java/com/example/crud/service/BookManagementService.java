package com.example.crud.service;

import com.example.crud.entity.Book;
import com.example.crud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookManagementService {
    @Autowired
    BookRepository bookRepository;

    public Book storeBook(Book book) {
        return bookRepository.save(book);
    }
}
