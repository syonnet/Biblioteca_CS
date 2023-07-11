package com.sisgo.biblioteca.servicios;

import com.sisgo.biblioteca.interfaces.AfiliadoRepository;
import com.sisgo.biblioteca.objetos.Afiliado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AfiliadoService {

    @Autowired
    AfiliadoRepository afiliadoRepository;

    public List<Afiliado> obtenerAfiliados() {
        return afiliadoRepository.findAll();
    }

    public void guardarAfiliado(Afiliado afiliado) {
        afiliadoRepository.save(afiliado);
    }

    public Optional<Afiliado> actualizarAfiliadoPorId(String cedula) {
        return afiliadoRepository.findById(cedula);
    }

    public void eliminarAfiliadoPorId(String cedula) {
        afiliadoRepository.deleteById(cedula);
    }

}
