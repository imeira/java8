package com.imeira.java8.exemplo2.stream;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;
import java.util.stream.Collectors;

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

    System.out.println("XXX Strem.min or max - compara e retorna menor valor. XXX");
    Optional<Integer> min = lista.stream()
            .filter(e -> e % 2 == 0)
            .min(Comparator.naturalOrder());
    System.out.println(min.get());

    System.out.println("XXX Strem.collect - Guardo Nova lista apenas com numero pares e multiplica por 3. XXX");
    List<Integer> novaLista = lista.stream()
            .filter(e -> e % 2 == 0)
            .map(e -> e *3) // multiplica por 3
            .collect(Collectors.toList());
    System.out.println(novaLista);

    System.out.println("XXX Strem.collect - Guardo num paga e agrupa pares e impares. XXX");
    Map<Boolean, List<Integer>> mapa = lista.stream()
            .map(e -> e * 3)
            .collect(Collectors.groupingBy(e -> e % 2 == 0));
    System.out.println(mapa);

    System.out.println("XXX Strem.collect - Guardo num paga e agrupa  diisores por 3. XXX");
    Map<Integer, List<Integer>> mapa2 = lista.stream()
            .map(e -> e * 3)
            .collect(Collectors.groupingBy(e -> e % 3));
    System.out.println(mapa2);

    System.out.println("XXX Strem.joining - Transforma a array de Integer em string e concatena. XXX");
    String collect = lista.stream()
            .map(e -> String.valueOf(e))
            .collect(Collectors.joining());
    System.out.println(collect);

    System.out.println("XXX Strem.joining - Transforma a array de Integer em string e concatena e coloca delimitador. XXX");
    String collect2 = lista.stream()
            .map(e -> String.valueOf(e))
            .collect(Collectors.joining(";"));
    System.out.println(collect2);


  }

}
