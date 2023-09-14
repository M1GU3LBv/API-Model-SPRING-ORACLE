package com.upeu.TestExam.controller;

import com.upeu.TestExam.model.Categoria;
import com.upeu.TestExam.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.upeu.TestExam.utils.APIS.CATEGORIA_API;

@RestController
@RequestMapping(CATEGORIA_API)
public class CategoriaController {
    @Autowired
    CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity getCategoria(){
        List<Categoria> list = categoriaService.listAllCategoria();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object>saveCategoria(@RequestBody Categoria categoria) {
        categoriaService.saveCategoria(categoria);
        return new ResponseEntity(HttpStatus.OK);
    }
    @DeleteMapping ("/{id}")
    public ResponseEntity deleteCategoria(@PathVariable Long id) {
        categoriaService.deleteCategoria(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
