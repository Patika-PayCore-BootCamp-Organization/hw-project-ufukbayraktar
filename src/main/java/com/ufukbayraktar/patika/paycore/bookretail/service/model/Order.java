package com.ufukbayraktar.patika.paycore.bookretail.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private int version;

    private Long customerId;

    @DecimalMin(value = "0.0", inclusive = false, message = "Price can not be less than 0.")
    private BigDecimal totalPrice;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @NotEmpty(message = "Order must have more than one book")
    @ManyToMany(cascade = {CascadeType.ALL})
    private List<Book> bookList;

    private Long totalBookCount;
}
