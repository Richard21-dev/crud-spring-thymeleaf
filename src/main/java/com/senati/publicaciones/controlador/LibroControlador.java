package com.senati.publicaciones.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.senati.publicaciones.servicio.LibroServicio;

// import org.springframework.web.bind.annotation.RequestParam;

import com.senati.publicaciones.entidad.Libro;



@Controller
public class LibroControlador {
    @Autowired
    private LibroServicio servicio;

    @GetMapping("/libros")
    public String listarLibros(Model modelo) {
        modelo.addAttribute("libros", servicio.listarLibros());
        return "libros";
    }
    @GetMapping("/libros/registrar")
    public String crearLibroFormulario(Model modelo) {
        Libro libro = new Libro();
        modelo.addAttribute("libro",libro);
        return "registrar_libro";
    }
    
    @PostMapping("/libros")
    public String guardarLibro(@ModelAttribute("libro") Libro libro) {
        servicio.guardarLibro(libro);
        return "redirect:/libros";
    }
    
    @GetMapping("/libros/editar/{id}")
    public String editarLibroFormulario(@PathVariable Long id,Model modelo) {
        modelo.addAttribute("libro",servicio.obtenerLibroPorId(id));
        return "editar_libro";
    }

    @PostMapping("/libros/{id}")
    public String actualizarLibro(@PathVariable Long id,@ModelAttribute("libro") Libro libro,Model modelo) {
        Libro libroExist = servicio.obtenerLibroPorId(id);
        libroExist.setId(id);
        libroExist.setAutor(libro.getAutor());
        libroExist.setTitulo(libro.getTitulo());
        libroExist.setGenero(libro.getGenero());
        libroExist.setIsbn(libro.getIsbn());
        servicio.actualizarLibro(libroExist);
        return "redirect:/libros";
    }

    @GetMapping("/libros/{id}")
    public String eliminarLibro(@PathVariable Long id){
        servicio.eliminarLibro(id);
        return "redirect:/libros";
    }
}
