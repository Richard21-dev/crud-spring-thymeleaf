package com.senati.publicaciones.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senati.publicaciones.entidad.Libro;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro,Long>{

}
