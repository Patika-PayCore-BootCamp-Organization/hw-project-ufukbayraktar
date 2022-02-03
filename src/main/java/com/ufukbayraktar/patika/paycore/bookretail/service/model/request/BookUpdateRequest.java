package com.ufukbayraktar.patika.paycore.bookretail.service.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookUpdateRequest {

        @NotEmpty(message = "Name can not be empty.")
        private String name;

        private String description;

        @NotEmpty(message = "Writer can not be empty.")
        private String writer;

        @DecimalMin(value = "0.0", inclusive = false, message = "Price can not be less than 0.")
        private BigDecimal price;

        @NotNull(message = "Stock can not be null.")
        private Long remainingStock;

}
