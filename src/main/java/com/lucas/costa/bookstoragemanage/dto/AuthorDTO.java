package com.lucas.costa.bookstoragemanage.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {


    private Long id;


    @NotBlank//Anotação que faz verificação do campo. O mesmo não pode ser em Branco.
    @Size (max = 200)   //Anotação que nos permite dfinir um tamanho de entrada para o atributo.
    private String name;

    @NotNull//Informa que o valor deste atributo não pode ser nulo.
    @Size (max = 100)   //Anotação que nos permite dfinir um tamanho de entrada para o atributo.
    private Integer age;

}
