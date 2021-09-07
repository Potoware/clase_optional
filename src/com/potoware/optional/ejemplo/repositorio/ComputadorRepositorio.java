package com.potoware.optional.ejemplo.repositorio;

import com.potoware.optional.ejemplo.models.Computador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements IRepositorio{
    private List<Computador> datasource;

    public ComputadorRepositorio() {
        datasource = new ArrayList<>();
        datasource.add(new Computador("Asus Rog", "Strix G512"));
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
