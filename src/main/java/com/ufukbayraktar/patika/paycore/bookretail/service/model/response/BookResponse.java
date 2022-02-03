package com.ufukbayraktar.patika.paycore.bookretail.service.model.response;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {
    private String message;
    private boolean isError;
}
