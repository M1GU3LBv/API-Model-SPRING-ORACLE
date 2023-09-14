package com.upeu.TestExam.controller;

import com.upeu.TestExam.model.Cliente;
import com.upeu.TestExam.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.upeu.TestExam.utils.APIS.CLIENTE_API;


@RestController
@RequestMapping (CLIENTE_API)
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @GetMapping
    public ResponseEntity getCliente(){
     List<Cliente> list = clienteService.listAllCliente();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Object> saveCliente(@RequestBody Cliente cliente){
        clienteService.saveCliente(cliente);
        return new ResponseEntity(HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCliente(@PathVariable("id") long id){
        clienteService.deleteCliente(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
