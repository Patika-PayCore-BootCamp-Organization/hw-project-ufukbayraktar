package com.ufukbayraktar.patika.paycore.bookretail.service.controller;

import com.ufukbayraktar.patika.paycore.bookretail.service.model.Book;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.request.BookCreateRequest;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.response.BookCreateResponse;
import com.ufukbayraktar.patika.paycore.bookretail.service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(path = "/create")
    public BookCreateResponse createBook(@RequestBody BookCreateRequest request) {
        return bookService.createBook(request);
    }

    @GetMapping(path = "/{id}")
    public Optional<Book> getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }

}
