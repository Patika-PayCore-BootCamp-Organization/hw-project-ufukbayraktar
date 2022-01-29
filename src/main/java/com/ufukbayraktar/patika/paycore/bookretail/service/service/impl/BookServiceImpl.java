package com.ufukbayraktar.patika.paycore.bookretail.service.service.impl;

import com.ufukbayraktar.patika.paycore.bookretail.service.model.Book;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.request.BookCreateRequest;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.response.BookCreateResponse;
import com.ufukbayraktar.patika.paycore.bookretail.service.repository.BookRepository;
import com.ufukbayraktar.patika.paycore.bookretail.service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookCreateResponse createBook(BookCreateRequest request) {
        Book book = new Book();
        book.setName(request.getName());
        book.setPrice(request.getPrice());
        book.setDescription(request.getDescription());
        book.setWriter(request.getWriter());
        book.setRemainingStock(request.getRemainingStock());

        BookCreateResponse response = new BookCreateResponse();

        try {
            bookRepository.save(book);
            response.setError(false);
            response.setMessage("Book saved successfully.");
            return response;
        } catch (Exception e) {
            response.setError(true);
            response.setMessage(e.getMessage());
            System.err.println(e.getMessage());
            return response;
        }
    }

    @Override
    public Optional<Book> getBook(Long id) {
        return bookRepository.findById(id);
    }
}
