package com.ufukbayraktar.patika.paycore.bookretail.service.service.impl;

import com.ufukbayraktar.patika.paycore.bookretail.service.entity.Book;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.dto.BookDTO;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.request.BookCreateRequest;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.request.BookUpdateRequest;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.response.BookResponse;
import com.ufukbayraktar.patika.paycore.bookretail.service.model.response.BookUpdateResponse;
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
    public BookResponse createBook(BookCreateRequest request) {
        Book book = new Book();
        book.setName(request.getName());
        book.setPrice(request.getPrice());
        book.setDescription(request.getDescription());
        book.setWriter(request.getWriter());
        book.setRemainingStock(request.getRemainingStock());

        BookResponse response = new BookResponse();

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

    @Override
    public BookResponse deleteBook(Long id) {

        BookResponse response = new BookResponse();
        try {
            Optional<Book> book = bookRepository.findById(id);
            if(book.isPresent()) {
                bookRepository.deleteById(id);
                response.setError(false);
                response.setMessage("Book deleted successfully");
            }
            else {
                response.setError(false);
                response.setMessage("Book is not found");
            }
            return response;
        }
        catch (Exception e) {
            response.setError(true);
            response.setMessage(e.getMessage());
            return response;
        }
    }

    public BookUpdateResponse updateBook(BookUpdateRequest request, Long id) {
        BookUpdateResponse response = new BookUpdateResponse();
        try {
            Optional<Book> book = bookRepository.findById(id);
            if (book.isPresent()){
                Book bookPresent = book.get();
                bookPresent.setName(request.getName());
                bookPresent.setPrice(request.getPrice());
                bookPresent.setDescription(request.getDescription());
                bookPresent.setWriter(request.getWriter());
                bookPresent.setRemainingStock(request.getRemainingStock());
                bookRepository.save(bookPresent);
                BookDTO dto = Book.toDTO(bookPresent);

                response.setError(false);
                response.setMessage("Book updated successfully");
                response.setBookDTO(dto);
            }
            else{
                response.setError(false);
                response.setMessage("Book is not found");
            }
            return response;

        }

        catch (Exception e){
            response.setError(true);
            response.setMessage(e.getMessage());
            return response;
        }
    }
}
