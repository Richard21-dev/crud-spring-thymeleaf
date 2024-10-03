package com.senati.publicaciones.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="autor",nullable=false,length = 128)
    private String autor;

    @Column(name = "titulo",nullable = false,length = 128)
    private String titulo;

    @Column(name = "genero",nullable = false,length = 20)
    private String genero;

    @Column(name = "isbn",nullable = false,length = 13)
    private String isbn;

    public Libro(){
    }

    public Libro(String autor,String titulo,String genero,String isbn){
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.isbn= isbn;
    }
    
    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
}
