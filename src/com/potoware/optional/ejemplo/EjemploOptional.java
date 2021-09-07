package com.potoware.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        String nombre = "Amdres";

        Optional<String> opt = Optional.ofNullable(nombre);
        System.out.println(opt.get());
        System.out.println(opt.isPresent());
        if(opt.isPresent()){
            System.out.println("Hola "+opt.get());
        }
        opt.ifPresent(valor -> System.out.println("ifPresent: Hola "+valor));

        nombre = "Muñeca";
        opt = Optional.ofNullable(nombre);
        System.out.println("Hola "+opt);
        System.out.println(opt.isEmpty());

        opt.ifPresent(valor -> System.out.println(valor));
        opt.ifPresentOrElse(valor -> System.out.println(valor),()-> System.out.println("No existe"));
        
        Optional<String> optEmpty = Optional.empty();
        System.out.println(opt.isEmpty());
    }
}
