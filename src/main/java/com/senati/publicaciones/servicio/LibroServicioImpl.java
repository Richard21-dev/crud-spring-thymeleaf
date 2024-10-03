package com.senati.publicaciones.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senati.publicaciones.entidad.Libro;
import com.senati.publicaciones.repositorio.LibroRepositorio;

@Service
public class LibroServicioImpl implements  LibroServicio {
    @Autowired
    private LibroRepositorio repositorio;

    @Override
    public List<Libro> listarLibros() {
        return repositorio.findAll();
    }

    @Override
    public Libro guardarLibro(Libro libro) {
        return repositorio.save(libro);
    }

    @Override
    public Libro obtenerLibroPorId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Libro actualizarLibro(Libro libro) {
        return repositorio.save(libro);
    }

    @Override
    public void eliminarLibro(Long id) {
        repositorio.deleteById(id);
    }

}
