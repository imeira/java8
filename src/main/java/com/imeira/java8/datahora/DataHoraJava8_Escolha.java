package com.imeira.java8.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * JAVA 8 - API de Data e Hora 
 * (LocalDateTime x Instant x ZonedDateTime)
 * 
 */
public class DataHoraJava8_Escolha {

  public static void main(String[] args) {

    // LocalDateTime - Data + Hora
    
    // Instant - Data + Hora + GMT
    
    // ZonedDateTime - Data + Hora + Fuso Horário
    
    Instant now = Instant.now();
//    now.plus(5, ChronoUnit.MONTHS);
    
    ZonedDateTime atZone = now.atZone(ZoneId.of("America/Sao_Paulo"));
    System.out.println(now);
    System.out.println(atZone);
    ZonedDateTime plusMonths = atZone.plusMonths(1);
    
  }
  
}
