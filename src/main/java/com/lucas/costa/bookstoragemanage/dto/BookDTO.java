package com.lucas.costa.bookstoragemanage.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Long id;

    @NotBlank //Informa que este campo não pode ser em branco.
    @Size(max=200)// Informa e especifica o tamanho dos dados que podem ser inseridos nesse campo.
    private String name;

    @NotNull //Informa que o valor deste atributor não pode ser Nulo.
    private Integer pages;

    @NotNull
    private Integer chapters;

    @NotBlank
    @Size(max = 100)

    @NotBlank
    @Size(max = 200)
    private  String isbn;

    @NotBlank
    @Size (max = 200)
    //Essa anotação @Pattern serve para tratar uma exceção em um dado especifico.
    @Pattern(regexp ="(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$",
            message = "ISBN format must be a valid format")
    private String publisherName;

    @Valid //Anotação própria do BeanValidation para que todas as anotações acima definam seus usos.
    @NotNull //Autor Objeto de Relacionamento não pode ser nullo.
    private AuthorDTO authorDTO;

}
