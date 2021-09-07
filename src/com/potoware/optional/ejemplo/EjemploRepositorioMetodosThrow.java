package com.potoware.optional.ejemplo;

import com.potoware.optional.ejemplo.models.Computador;
import com.potoware.optional.ejemplo.repositorio.ComputadorRepositorio;
import com.potoware.optional.ejemplo.repositorio.IRepositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosThrow {
    public static void main(String[] args) {

        IRepositorio<Computador> repositorio = new ComputadorRepositorio();
        Computador pc = repositorio.filtrar("rog")
                .orElseThrow(IllegalStateException::new);

        System.out.println(pc);
        String archivo = "documentopdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".")+1))
                .orElseThrow();

        System.out.println(extension);


    }


}
