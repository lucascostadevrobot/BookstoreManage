package entity;

/*
* 1- Realizar a criação do pacote entity
* 2- Criar uma classe java de acordo com o UML
* 3- Criar os atributos do modelo
* 4- Fazer o mapeamento da classe com as anotações JPA
*
* JPA- JPA – Java Persistence API é uma especificação do Java EE que define um mapeamento
entre uma estrutura relacional e um modelo de objetos em Java
*
* JPA- Mapeamento objeto-relacional em aplicações JPA consiste na declaração de
mapeamentos entre classes e tabelas, e atributos e colunas em tempo de desenvolvimento, e da
sincronização de instancias e registros durante o tempo de execução.
*
* PROJECT LOMBOK- Essa biblioteca diminuirá o uso manual de códigos padrões no desenvolvimento com o Java do tipo
* Geters e Seters. Nós incluimos essa biblioteca em tempo de execução da compilação.
*
*
* */


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;




@Data //Automaticamente Gaters e Seters e usas utilizações
@Builder //Automatico  classe nos padrões projeto Builders utilizado para construção de objetos seguros
@NoArgsConstructor //Automatico construtures
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @Column(nullable = false, unique = true) //Definindo o campo name como unique e não pode ser nulo
    private String name;

    @Column(nullable = false) //Esse valor nunca pode ser nulo
    private Integer age;


}
