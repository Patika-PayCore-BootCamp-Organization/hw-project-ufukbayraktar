package com.ufukbayraktar.patika.paycore.bookretail.service.repository;

import com.ufukbayraktar.patika.paycore.bookretail.service.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}