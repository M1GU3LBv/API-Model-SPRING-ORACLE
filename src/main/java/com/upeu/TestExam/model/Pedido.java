package com.upeu.TestExam.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "fecha", columnDefinition ="date")
    private String fecha;
    @ManyToOne
    @JoinColumn(name = "cliente_id",referencedColumnName = "id")
    private Cliente cliente;
}
