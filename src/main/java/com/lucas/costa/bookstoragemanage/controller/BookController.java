package com.lucas.costa.bookstoragemanage.controller;

import com.lucas.costa.bookstoragemanage.controller.dto.MessageResponseDTO;
import com.lucas.costa.bookstoragemanage.service.BookService;
import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Informa ao Spring que essa classe representa uma Classe Controller.
@RequestMapping("/api/v1/books")  //Indicamos um Endpoint onde iremos fazer o acesso a este controller.

public class BookController {


    /*Abaixo Realizaremos uma injeção de depêndencias através
     das Anotações do SpringBoot dentro da nossa Classe Controladora
     */
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /*
    * O mapeamento com a Anotação Spring Framework @PostMapping significa que nós
    * estamos marcando essa operação como POST que dentro do modelo arquitetural REST
    * que este método vai ser responsável, junto  com o parametro(CORPO) passado na requisição
    * que ele precisa ser passado no corpo da requisição junto com Book*/


    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
        //Iremos delegar esse método para nossa classe de Serviços
        return bookService.create(book);
    }
}
