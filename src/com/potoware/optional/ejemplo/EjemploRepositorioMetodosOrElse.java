package com.potoware.optional.ejemplo;

import com.potoware.optional.ejemplo.models.Computador;
import com.potoware.optional.ejemplo.repositorio.ComputadorRepositorio;
import com.potoware.optional.ejemplo.repositorio.IRepositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        IRepositorio<Computador> repositorio = new ComputadorRepositorio();
        Computador defecto = new Computador("Lenovo", "X1 Carbon");
        Computador pc = repositorio.filtrar("rog")
                .orElse(valorDefecto());

        System.out.println(pc);

        pc = repositorio.filtrar("macbook").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);

    }

    public static  Computador valorDefecto() {
        System.out.println("obteniendo valor por defecto");
        return new Computador("Potoware", "Neodax X12");
    }

}
