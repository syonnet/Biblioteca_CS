package com.sisgo.biblioteca.objetos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Prestamo {

    @Id
    private Integer id;
    private String libro;
    private String afiliado;
    private String fecha_prestamo;
    private String fecha_maxima;

}
