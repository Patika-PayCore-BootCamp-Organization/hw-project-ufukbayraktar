package com.ufukbayraktar.patika.paycore.bookretail.service.repository;

import com.ufukbayraktar.patika.paycore.bookretail.service.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
