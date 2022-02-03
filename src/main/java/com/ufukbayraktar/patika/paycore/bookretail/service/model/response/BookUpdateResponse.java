package com.ufukbayraktar.patika.paycore.bookretail.service.model.response;

import com.ufukbayraktar.patika.paycore.bookretail.service.model.dto.BookDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BookUpdateResponse extends  BookResponse{
    private BookDTO bookDTO;
}
