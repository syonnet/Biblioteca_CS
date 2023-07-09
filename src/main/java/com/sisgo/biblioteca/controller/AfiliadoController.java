package com.sisgo.biblioteca.controller;

import com.sisgo.biblioteca.interfaces.AfiliadoRepository;
import com.sisgo.biblioteca.objetos.Afiliado;
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
    AfiliadoRepository afiliadoRepository;

    // CRUD - GET
    @GetMapping("/formAfiliado")
    public String formularioAfiliado(Model model) {
        model.addAttribute("afiliado", new Afiliado());
        return "formAfiliado";
    }

    @GetMapping("/listAfiliado")
    public String listaAfiliado(Model model) {
        List<Afiliado> afiliados = afiliadoRepository.findAll();
        model.addAttribute("afiliados", afiliados);
        return "listAfiliado";
    }

    // CRUD - POST
    @PostMapping("/formAfiliado")
    public String crearAfiliado(Afiliado afiliado) {
        afiliadoRepository.save(afiliado);
        return "redirect:/listAfiliado";
    }

    // CRUD - UPDATE
    @GetMapping("/editAfiliado/{cedula}")
    public String editarAfiliado(@PathVariable String cedula, Model model) {
        Optional<Afiliado> afiliado = afiliadoRepository.findById(cedula);
        model.addAttribute("afiliado", afiliado);
        return "formAfiliado";
    }

    // CRUD - DELETE
    @GetMapping("/deleteAfiliado/{cedula}")
    public String eliminarAfiliado(@PathVariable String cedula) {
        afiliadoRepository.deleteById(cedula);
        return "redirect:/listAfiliado";
    }

}
