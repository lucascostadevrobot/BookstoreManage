package com.lucas.costa.bookstoragemanage.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false, unique = true)
    private  String name;

    @Column (nullable = false)
    private  Integer pages;

    @Column(nullable = false)
    private  Integer chapters;

    @Column(nullable = false)
    private  String isbn;

    @Column(name = "publisher_name", nullable = false, unique = true)
    private  String publisherName;


    /*
    * O uso da anotação JoinColum nos permite criar um Join e retornar os dados para o usuário
    * No parametro do JoinColumm nós definimos  através (name = "author_id") que nossa coluna Author
    * será nossa chave estrangeira.
    */
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}) //Mapeamento para relacionamento de Muitos para Um
    @JoinColumn (name = "author_id")//Qual atributo irá fazer o relacionamento, neste caso é o autor.
    private  Author author; //Declando Author do tipo Objeto








}
