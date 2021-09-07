package com.potoware.optional.ejemplo;

import com.potoware.optional.ejemplo.models.Computador;
import com.potoware.optional.ejemplo.models.Fabricante;
import com.potoware.optional.ejemplo.models.Procesador;
import com.potoware.optional.ejemplo.repositorio.ComputadorRepositorio;
import com.potoware.optional.ejemplo.repositorio.IRepositorio;

public class EjemploRepositorioMetodosMapFilter {
    public static void main(String[] args) {

        IRepositorio<Computador> repositorio = new ComputadorRepositorio();
        Computador defecto = new Computador("Lenovo", "X1 Carbon");
        String pc = repositorio.filtrar("rog")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(f->"intel".equalsIgnoreCase(f.getNombre()))
                .map(Fabricante::getNombre).orElse("Desconocido");

        System.out.println(pc);

    }
}
