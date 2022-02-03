package com.ufukbayraktar.patika.paycore.bookretail.service.model.dto;

import lombok.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {
    private String name;
    private String description;
    private String writer;
    private BigDecimal price;
    private Long remainingStock;
}
