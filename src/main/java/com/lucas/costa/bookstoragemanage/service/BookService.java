package com.lucas.costa.bookstoragemanage.service;

import com.lucas.costa.bookstoragemanage.controller.dto.MessageResponseDTO;
import com.lucas.costa.bookstoragemanage.repository.BookRepository;
import com.lucas.costa.bookstoragemanage.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Anotação que diz que esta classe será gerenciada pelo spring
public class BookService {

    private final BookRepository bookRepository;

    //Geração do construtor para injeção das dependências da nosso classe Repository
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public MessageResponseDTO create(Book book){
        Book savedBook = bookRepository.save(book); //Salva nosso book
        return MessageResponseDTO.builder()
                .message("Book Criado com o ID" + savedBook.getId())
                .build();
    }
}
