package com.upeu.TestExam.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "categoria")
public class
Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;

}
