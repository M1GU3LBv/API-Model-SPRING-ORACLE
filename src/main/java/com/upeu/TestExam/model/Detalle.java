package com.upeu.TestExam.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Detalle")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "fecha")
    private String fecha;
    @Column (name = "hora")
    private String hora;
    @Column (name = "direccion")
    private String direccion;
    @Column (name = "Total")
    private String Total;
    @ManyToOne
    @JoinColumn(name = "idproducto",referencedColumnName = "id")
    private Producto producto;
    @OneToOne
    @JoinColumn(name = "idpedido",referencedColumnName = "id")
    private Pedido pedido;



}
