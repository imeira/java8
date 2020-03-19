package com.imeira.java8.exemplo2.stream;

import java.util.Arrays;
import java.util.List;

/**
 * JAVA 8 - Streams  <br>
 *
 */
public class Java8Streams {

  public static void main(String[] args) {

    List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

    //JAVA 8 : STREAMS
    System.out.println("XXX Strem.skip - Operacao intermediaria: Pula os 2 primeiros elementos do stream, no caso 1 e 5. XXX");
    lista.stream()
            .skip(2)
            .forEach(System.out::println);

    System.out.println("XXX Strem.limit - Operacao intermediaria: Limita o stream para executar no maximo 2 elementos no caso 1 e 5. XXX");
    lista.stream()
            .limit(2)
            .forEach(System.out::println);

    System.out.println("XXX Strem.distinct - Operacao intermediaria: Nao permite que retorne elementos repetidos. XXX");
    lista.stream()
            .distinct() // equals hascode
            .forEach(System.out::println);

    System.out.println("XXX Strem.filter - Operacao intermediaria: Filtro especifico. apanas numeros pares. XXX");
    lista.stream()
            .filter( e -> e % 2 == 0)
            .forEach(System.out::println);

    System.out.println("XXX Strem.map - multiplica todos elementos por 2. a lista original nao eh modificada. XXX");
    lista.stream()
            .map( e -> e * 2)
            .forEach(System.out::println);

    System.out.println("XXX Lista original XXX");
    System.out.println(lista);


  }

}
