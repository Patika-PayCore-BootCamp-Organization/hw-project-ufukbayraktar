package com.ufukbayraktar.patika.paycore.bookretail.service.model.response;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookCreateResponse {
    private String message;
    private boolean isError;
}
