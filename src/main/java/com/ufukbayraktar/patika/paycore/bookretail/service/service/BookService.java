package com.ufukbayraktar.patika.paycore.bookretail.service.service;

import com.ufukbayraktar.patika.paycore.bookretail.service.entity.Book;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.dto.BookDTO;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.request.BookCreateRequest;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.request.BookUpdateRequest;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.response.BookResponse;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.response.BookUpdateResponse;

import java.util.Optional;

public interface BookService{
    BookResponse createBook(BookCreateRequest request);

    Optional<Book> getBook(Long id);

    BookResponse deleteBook(Long id);

    BookUpdateResponse updateBook(BookUpdateRequest request, Long id);
}
