package com.ufukbayraktar.patika.paycore.bookretail.service.service;

import com.ufukbayraktar.patika.paycore.bookretail.service.model.Book;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.request.BookCreateRequest;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.response.BookCreateResponse;

import java.util.Optional;

public interface BookService {
    BookCreateResponse createBook(BookCreateRequest request);

    Optional<Book> getBook(Long id);
}
