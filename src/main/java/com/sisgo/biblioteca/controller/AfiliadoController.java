package com.sisgo.biblioteca.controller;

import com.sisgo.biblioteca.objetos.Afiliado;
import com.sisgo.biblioteca.servicios.AfiliadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class AfiliadoController {

    @Autowired
    AfiliadoService afiliadoService;

    // CRUD - GET
    @GetMapping("/formAfiliado")
    public String formularioAfiliado(Model model) {
        model.addAttribute("afiliado", new Afiliado());
        return "formAfiliado";
    }

    @GetMapping("/listAfiliado")
    public String listaAfiliado(Model model) {
        List<Afiliado> afiliados = afiliadoService.obtenerAfiliados();
        model.addAttribute("afiliados", afiliados);
        return "listAfiliado";
    }

    // CRUD - POST
    @PostMapping("/formAfiliado")
    public String crearAfiliado(Afiliado afiliado) {
        afiliadoService.guardarAfiliado(afiliado);
        return "redirect:/listAfiliado";
    }

    // CRUD - UPDATE
    @GetMapping("/editAfiliado/{cedula}")
    public String editarAfiliado(@PathVariable String cedula, Model model) {
        Optional<Afiliado> afiliado = afiliadoService.actualizarAfiliadoPorId(cedula);
        model.addAttribute("afiliado", afiliado.orElse(new Afiliado()));
        return "formAfiliado";
    }

    // CRUD - DELETE
    @GetMapping("/deleteAfiliado/{cedula}")
    public String eliminarAfiliado(@PathVariable String cedula) {
        afiliadoService.eliminarAfiliadoPorId(cedula);
        return "redirect:/listAfiliado";
    }

}
