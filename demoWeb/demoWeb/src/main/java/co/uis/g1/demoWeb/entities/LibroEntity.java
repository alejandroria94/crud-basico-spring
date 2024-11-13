package co.uis.g1.demoWeb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "libros")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibroEntity {

    @Id
    @Column(name = "isbn", length = 100)
    private String isbn;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "numero_de_paginas")
    private Integer numeroDePaginas;

    @Column(name = "annio")
    private Integer annio;

    @Column(name = "codigo_autor", length = 100)
    private String codigoAutor;

    @Column(name = "id_categoria")
    private Integer idCategoria;



}