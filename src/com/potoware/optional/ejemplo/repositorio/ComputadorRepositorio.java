package com.potoware.optional.ejemplo.repositorio;

import com.potoware.optional.ejemplo.models.Computador;
import com.potoware.optional.ejemplo.models.Fabricante;
import com.potoware.optional.ejemplo.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ComputadorRepositorio implements IRepositorio{
    private List<Computador> datasource;

    public ComputadorRepositorio() {
        datasource = new ArrayList<>();
        Procesador proc = new Procesador("i9-1990" , new Fabricante("intel"));
        Computador asus = new Computador("Asus Rog", "Strix G512");
        asus.setProcesador(proc);
        datasource.add(asus);
        datasource.add(new Computador("MacBook Pro", "Retina 2018"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
       return datasource.stream().filter(c-> c.getNombre().toUpperCase().contains(nombre.toUpperCase())).findFirst();
        /*for(Computador c: datasource){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        */

    }
}
