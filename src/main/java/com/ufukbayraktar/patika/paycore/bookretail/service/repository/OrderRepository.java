package com.ufukbayraktar.patika.paycore.bookretail.service.repository;

import com.ufukbayraktar.patika.paycore.bookretail.service.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
