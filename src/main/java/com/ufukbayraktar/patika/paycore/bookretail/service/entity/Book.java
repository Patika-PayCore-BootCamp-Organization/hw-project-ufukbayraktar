package com.ufukbayraktar.patika.paycore.bookretail.service.entity;

import com.ufukbayraktar.patika.paycore.bookretail.service.model.dto.BookDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private int version;

    @NotEmpty(message = "Name can not be empty.")
    private String name;

    private String description;

    @NotEmpty(message = "Writer can not be empty.")
    private String writer;

    @DecimalMin(value = "0.0", inclusive = false, message = "Price can not be less than 0.")
    private BigDecimal price;

    @NotNull(message = "Stock can not be null.")
    private Long remainingStock;

    public static BookDTO toDTO(Book book){
        BookDTO dto = new BookDTO();
        dto.setName(book.getName());
        dto.setDescription(book.getDescription());
        dto.setPrice(book.getPrice());
        dto.setWriter(book.getWriter());
        dto.setRemainingStock(book.getRemainingStock());
        return dto;
    }
}


