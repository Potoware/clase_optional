package com.potoware.optional.ejemplo;

import com.potoware.optional.ejemplo.models.Computador;
import com.potoware.optional.ejemplo.repositorio.ComputadorRepositorio;
import com.potoware.optional.ejemplo.repositorio.IRepositorio;

import java.util.Optional;

public class EjemploRepositorio {

    public static void main(String[] args) {

        IRepositorio<Computador> repositorio = new ComputadorRepositorio();
        repositorio.filtrar("rog").ifPresentOrElse(System.out::println,()-> System.out.println("No se encontro"));

        /* Optional <Computador> pc = repositorio.filtrar("Asus Rog");

        if(pc.isPresent()){
            System.out.println(pc.get());
        }else{

            System.out.println("no se encontro");
        }*/
    }
}
