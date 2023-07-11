package com.sisgo.biblioteca.controller;

import com.sisgo.biblioteca.interfaces.LibroRepository;
import com.sisgo.biblioteca.objetos.Libro;
import com.sisgo.biblioteca.servicios.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class LibroController {

    @Autowired
    LibroService libroService;

    // CRUD - GET
    @GetMapping("/formLibro")
    public String formularioLibro(Model model) {
        model.addAttribute("libro", new Libro());
        return "formLibro";
    }

    @GetMapping("/listLibro")
    public String listaLibro(Model model) {
        List<Libro> libros = libroService.obtenerLibros();
        model.addAttribute("libros", libros);
        return "listLibro";
    }

    // CRUD - POST
    @PostMapping("/formLibro")
    public String crearLibro(Libro libro) {
        libroService.guardarLibro(libro);
        return "redirect:/listLibro";
    }

    // CRUD - UPDATE
    @GetMapping("/editLibro/{id}")
    public String editarLibro(@PathVariable int id, Model model) {
        Optional<Libro> libro = libroService.actualizarLibroPorId(id);
        model.addAttribute("libro", libro.orElse(new Libro()));
        return "formLibro";
    }

    // CRUD - DELETE
    @GetMapping("/deleteLibro/{id}")
    public String eliminarLibro(@PathVariable int id) {
        libroService.eliminarLibroPorId(id);
        return "redirect:/listLibro";
    }

}
