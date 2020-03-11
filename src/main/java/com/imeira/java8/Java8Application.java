package com.imeira.java8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@SpringBootApplication
public class Java8Application {

	public static void filtro(List<String> lista, Predicate<String> condicao) {
		for(String s: lista) {
			if (condicao.test(s))
				System.out.println(s);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(Java8Application.class, args);
		List<String> lista1 = Arrays.asList("Santa Catarina", "Parana", "Sao Paulo", "Rio de Janeiro", "Brasilia", "Ceara");

		//Listas foreach
		System.out.println("XXXX Lista<String> foreach1 com java 8 XXX");
		lista1.forEach(x-> System.out.println(x));
		System.out.println("XXX Lista<String> foreach2 com java 8 XXX");
		lista1.forEach(System.out::println);

		System.out.println("XXX Predicate<String> Estados que iniciam com a letra S XXX");
		filtro(lista1, (s)->s.startsWith("S"));

		System.out.println("XXX Predicate<String> Estados que finalizam com a letra a XXX");
		filtro(lista1, (s)->s.endsWith("a"));

		System.out.println("XXX Predicate<String> imprime toda lista XXX");
		filtro(lista1, (s)->true);

		System.out.println("XXX Predicate<String> Nao imprime toda lista XXX");
		filtro(lista1, (s)->false);

		System.out.println("XXX Predicate<String> Nomes com mais de 10 caracteres XXX");
		filtro(lista1, (s)->s.length()>10);
	}

}
