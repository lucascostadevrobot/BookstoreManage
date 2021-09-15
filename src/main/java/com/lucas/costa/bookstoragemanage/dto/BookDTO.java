package com.lucas.costa.bookstoragemanage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Long id;


    private String name;

    private Integer pages;

    private Integer chapters;

    private  String isbn;

    private String publisherName;

    private AuthorDTO authorDTO;

}
