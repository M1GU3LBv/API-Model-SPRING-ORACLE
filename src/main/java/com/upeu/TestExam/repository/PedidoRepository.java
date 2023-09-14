package com.upeu.TestExam.repository;

import com.upeu.TestExam.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
