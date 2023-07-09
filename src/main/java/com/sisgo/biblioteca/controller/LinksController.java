package com.sisgo.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LinksController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("home")
    public String home() {
        return "home";
    }

    @GetMapping("contacto")
    public String contacto() {
        return "contacto";
    }

    @GetMapping("libro")
    public String libro() {
        return "libro";
    }

    @GetMapping("afiliado")
    public String afiliado() {
        return "afiliado";
    }

    @GetMapping("prestamo")
    public String prestamo() {
        return "prestamo";
    }

}
