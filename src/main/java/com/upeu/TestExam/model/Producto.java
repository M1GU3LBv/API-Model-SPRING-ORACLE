package com.upeu.TestExam.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "nombre")
    private String Nombre;
    @Column (name = "precio")
    private String Precio;
    @Column (name = "stock", columnDefinition = "int")
    private Integer Stock;
    @Column (name = "descripcion")
    private String Descripcion;
    @ManyToOne
    @JoinColumn(name = "categoria_id",referencedColumnName = "id")
    private Categoria categoria;
}
