package com.sisgo.biblioteca.servicios;

import com.sisgo.biblioteca.interfaces.LibroRepository;
import com.sisgo.biblioteca.objetos.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> obtenerLibros() {
        return libroRepository.findAll();
    }

    public void guardarLibro(Libro libro) {
        libroRepository.save(libro);
    }

    public Optional<Libro> actualizarLibroPorId(int id) {
        return libroRepository.findById(id);
    }

    public void eliminarLibroPorId(int id) {
        libroRepository.deleteById(id);
    }

}
