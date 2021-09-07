package com.potoware.optional.ejemplo.repositorio;

import com.potoware.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface IRepositorio<T> {
    Optional <Computador> filtrar(String nombre);
}
