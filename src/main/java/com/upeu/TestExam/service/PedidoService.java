package com.upeu.TestExam.service;

import com.upeu.TestExam.model.Pedido;
import com.upeu.TestExam.repository.PedidoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PedidoService {
    @Autowired
    PedidoRepository pedidoRepository;

    public List<Pedido> listAllPedido() {
        return pedidoRepository.findAll();
    }

    public void savePedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    public Pedido getPedido(Long id) {
        return pedidoRepository.findById(id).get();

    }

    public void deletePedido(Long id) {
        pedidoRepository.deleteById(id);
    }


}
