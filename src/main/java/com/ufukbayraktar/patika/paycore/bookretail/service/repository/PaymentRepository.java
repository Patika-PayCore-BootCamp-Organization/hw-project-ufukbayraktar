package com.ufukbayraktar.patika.paycore.bookretail.service.repository;

import com.ufukbayraktar.patika.paycore.bookretail.service.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
