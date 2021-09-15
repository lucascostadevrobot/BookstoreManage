package com.lucas.costa.bookstoragemanage.dto;

/*Após criar a nossa Classe DTO precisamos criar um atributo do tipo String.
 * Precisamos injetar nossas anotações Lomnok


 *A ideia consiste basicamente em agrupar um conjunto de atributos numa
 *classe simples de forma a otimizar a comunicação.
 *Numa chamada remota, seria ineficiente passar cada
 *atributo individualmente. Da mesma forma seria ineficiente ou até
 *causaria erros passar uma entidade mais complexa.
 *Além disso, muitas vezes os dados usados na comunicação não refletem
 *exatamente os atributos do seu modelo. Então, um DTO seria uma classe
 *que provê exatamente aquilo que é necessário para um determinado processo.
 *
* */

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {

    private String message;
}
