package com.ufukbayraktar.patika.paycore.bookretail.service.service;

import com.ufukbayraktar.patika.paycore.bookretail.service.model.request.BookCreateRequest;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.response.BookCreateResponse;
public interface BookService {
    BookCreateResponse createBook(BookCreateRequest request);
}
