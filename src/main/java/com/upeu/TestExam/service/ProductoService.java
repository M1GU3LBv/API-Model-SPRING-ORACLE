package com.upeu.TestExam.service;

import com.upeu.TestExam.model.Producto;
import com.upeu.TestExam.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> listAllProducto() {
        return productoRepository.findAll();
    }


    public void saveProducto(Producto producto) {
        productoRepository.save(producto);
    }

    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);

    }

    public Producto getProducto(Long id) {
        return productoRepository.findById(id).get();

    }
}
