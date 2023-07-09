package com.sisgo.biblioteca.interfaces;

import com.sisgo.biblioteca.objetos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository <Libro, Integer> {

}
