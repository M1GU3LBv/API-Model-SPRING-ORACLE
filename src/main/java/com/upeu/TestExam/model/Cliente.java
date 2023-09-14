package com.upeu.TestExam.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "nombre")
    private String Nombre;
    @Column (name = "apellido")
    private String Apellido;
    @Column (name = "telefono")
    private String Telefono;
}
