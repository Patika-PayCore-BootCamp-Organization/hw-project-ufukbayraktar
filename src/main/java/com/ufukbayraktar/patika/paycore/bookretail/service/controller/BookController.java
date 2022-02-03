package com.ufukbayraktar.patika.paycore.bookretail.service.controller;

import com.ufukbayraktar.patika.paycore.bookretail.service.entity.Book;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.dto.BookDTO;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.request.BookCreateRequest;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.request.BookUpdateRequest;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.response.BookResponse;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.response.BookUpdateResponse;
import com.ufukbayraktar.patika.paycore.bookretail.service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(path = "/create")
    public BookResponse createBook(@RequestBody BookCreateRequest request) {
        return bookService.createBook(request);
    }

    @GetMapping(path = "/{id}")
    public Optional<Book> getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }

    @DeleteMapping(path = "/{id}")
    public BookResponse deleteBook(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }

    @PutMapping(path =  "/update/{id}")
    public BookUpdateResponse updateBook(@RequestBody BookUpdateRequest request, @PathVariable Long id) {
        return bookService.updateBook(request,id);
    }


//delete
    //update
    //getAllBooks

}
