package com.senati.publicaciones;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.senati.publicaciones.entidad.Libro;
// import com.senati.publicaciones.repositorio.LibroRepositorio;

@SpringBootApplication
public class PublicacionesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PublicacionesApplication.class, args);
	}

	// @Autowired
	// private LibroRepositorio repositorio;
	
    @Override
    public void run(String... args) throws Exception {
        // Libro ubik = new Libro("PKDick","Ubik","SciFi","9191211121333");
		// repositorio.save(ubik);
    }

}
