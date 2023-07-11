package com.sisgo.biblioteca.servicios;

import com.sisgo.biblioteca.interfaces.PrestamoRepository;
import com.sisgo.biblioteca.objetos.Prestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    public List<Prestamo> obtenerPrestamos() {
        return prestamoRepository.findAll();
    }

    public void guardarPrestamo(Prestamo prestamo) {
        prestamoRepository.save(prestamo);
    }

    public Optional<Prestamo> actualizarPrestamoPorId(int id) {
        return prestamoRepository.findById(id);
    }

    public void eliminarPrestamoPorId(int id) {
        prestamoRepository.deleteById(id);
    }

}
