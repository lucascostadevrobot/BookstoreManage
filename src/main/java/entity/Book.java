package entity;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column (nullable = false, unique = true)
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
    @JoinColumn //Qual atributo irá fazer o relacionamento, neste caso é o autor.
    public   Author author_id;
}
