package com.sisgo.biblioteca.interfaces;

import com.sisgo.biblioteca.objetos.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository <Prestamo, Integer> {

}
