package com.sisgo.biblioteca.objetos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Libro {

    @Id
    private Integer id;
    private String titulo;
    private String autor;
    private String editorial;
    private String categoria;

}
