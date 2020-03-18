package com.imeira.java8.stream.exemplo1;

import java.util.function.*;

public class MostraCliente implements Consumer<Cliente>{
   public void accept(Cliente c) {
       System.out.println(c.getNome());  
       System.out.println(c.getSenha());  
   }
}
