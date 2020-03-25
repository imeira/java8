package com.imeira.java8.datahora;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

/**
 * JAVA 8 - API de Data e Hora 
 * (Formatação e Parse)
 * 
 */
public class DataHoraJava8_Formatando {

  public static void main(String[] args) {

    // DateTimeFormatter

    DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
    //or
    DateTimeFormatter isoDate = DateTimeFormatter.ISO_DATE;
    //or
    DateTimeFormatter isoTime = DateTimeFormatter.ISO_TIME;


    //OBS::: FormatStyle depende do Locale padrao do Sistema. podemos mudar da forma abaixo
    //Locale.setDefault(Locale.US);

    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    //or
    formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
    //or
    formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);

    ZonedDateTime zdtNow = ZonedDateTime.now();
    LocalDateTime ldtNow = LocalDateTime.now();
    
    String format = formatter.format(zdtNow);
    
    System.out.println(zdtNow);
    System.out.println(format);
    
    DateTimeFormatter formatter2 = 
        DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
    
    String format2 = formatter2.format(ldtNow);
    System.out.println(format2);
    //or resultado igual do de cima
    String format3 = ldtNow.format(formatter2);
    System.out.println(format3);

    //TemporalAccessor inteface generica
    TemporalAccessor parse = formatter2.parse("29-07-2019 11-39-47");
    System.out.println(parse);
    //LocalDateTime a partir de um TemporalAccessor
    LocalDateTime from = LocalDateTime.from(parse);
    System.out.println(from);
    
    
    DateTimeFormatter formatterHora = 
        DateTimeFormatter.ofPattern("HH-mm-ss");
    TemporalAccessor parse2 = formatterHora.parse("08-11-34");
    System.out.println(parse2);
    LocalTime from2 = LocalTime.from(parse2);
    System.out.println(from2);
    //Da erro abaixo pq eh apenas hora o parse2
    //LocalDateTime.from(parse2);

  }
  
}
