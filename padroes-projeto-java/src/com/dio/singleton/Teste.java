package com.dio.singleton;

public class Teste {

    public static void main(String[] args) {

        //DESIGN PATTERN SINGLETON
        //Endereço de memória deve ser o mesmo, não importa
        //quantas vezes seja instanciado:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

    }
}
