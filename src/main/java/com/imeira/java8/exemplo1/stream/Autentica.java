package com.imeira.java8.exemplo1.stream;

@FunctionalInterface
public interface Autentica {
    public abstract boolean autenticaSenha(String senha);

}
