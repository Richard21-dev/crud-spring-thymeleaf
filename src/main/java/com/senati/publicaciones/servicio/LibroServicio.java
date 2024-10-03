package com.senati.publicaciones.servicio;

import java.util.List;

import com.senati.publicaciones.entidad.Libro;

public interface LibroServicio {
    public List<Libro> listarLibros();

    public Libro guardarLibro(Libro libro);

    public Libro obtenerLibroPorId(Long id);

    public Libro actualizarLibro(Libro libro);

    public void eliminarLibro(Long id);
}
