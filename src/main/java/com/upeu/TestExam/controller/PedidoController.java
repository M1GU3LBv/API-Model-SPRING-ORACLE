package com.upeu.TestExam.controller;

import com.upeu.TestExam.model.Pedido;
import com.upeu.TestExam.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.upeu.TestExam.utils.APIS.PEDIDO_API;

@RestController
@RequestMapping(PEDIDO_API)
public class PedidoController {
    @Autowired
    PedidoService pedidoService;

    @GetMapping
    public ResponseEntity getPedido(){
        List<Pedido> list = pedidoService.listAllPedido();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> savePedido(@RequestBody Pedido pedido){
        pedidoService.savePedido(pedido);
        return new ResponseEntity(HttpStatus.CREATED);
    }



}
