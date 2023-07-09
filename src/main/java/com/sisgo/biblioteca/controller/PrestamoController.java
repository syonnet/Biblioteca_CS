package com.sisgo.biblioteca.controller;

import com.sisgo.biblioteca.interfaces.PrestamoRepository;
import com.sisgo.biblioteca.objetos.Prestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class PrestamoController {

    @Autowired
    PrestamoRepository prestamoRepository;

    // CRUD - GET
    @GetMapping("/formPrestamo")
    public String formularioPrestamos(Model model) {
        model.addAttribute("prestamo", new Prestamo());
        return "formPrestamo";
    }

    @GetMapping("/listPrestamo")
    public String listaPrestamo(Model model) {
        List<Prestamo> prestamos = prestamoRepository.findAll();
        model.addAttribute("prestamos", prestamos);
        return "listPrestamo";
    }

    // CRUD - POST
    @PostMapping("/formPrestamo")
    public String crearPrestamo(Prestamo prestamo) {
        prestamoRepository.save(prestamo);
        return "redirect:/listPrestamo";
    }

    // CRUD - UPDATE
    @GetMapping("/editPrestamo/{id}")
    public String editarPrestamo(@PathVariable int id, Model model) {
        Optional<Prestamo> prestamo = prestamoRepository.findById(id);
        model.addAttribute("prestamo", prestamo);
        return "formPrestamo";
    }

    // CRUD - DELETE
    @GetMapping("/deletePrestamo/{id}")
    public String eliminarPrestamo(@PathVariable int id) {
        prestamoRepository.deleteById(id);
        return "redirect:/listPrestamo";
    }

}
