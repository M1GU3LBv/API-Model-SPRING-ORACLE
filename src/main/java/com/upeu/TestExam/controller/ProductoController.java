package com.upeu.TestExam.controller;

import com.upeu.TestExam.model.Producto;
import com.upeu.TestExam.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.upeu.TestExam.utils.APIS.PRODUCTO_API;

@RestController
@RequestMapping(PRODUCTO_API)
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping
    public ResponseEntity getProducto() {

        return new ResponseEntity(productoService.listAllProducto(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> saveProducto(@RequestBody Producto producto) {
        productoService.saveProducto(producto);
        return new ResponseEntity(HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProducto(@PathVariable Long id) {
        productoService.deleteProducto(id);
        return new ResponseEntity(HttpStatus.OK);
    }


}
