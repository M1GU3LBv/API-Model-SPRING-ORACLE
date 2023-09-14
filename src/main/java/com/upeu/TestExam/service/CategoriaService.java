package com.upeu.TestExam.service;

import com.upeu.TestExam.repository.CategoriaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.upeu.TestExam.model.Categoria;
import java.util.List;

@Service
@Transactional
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;
    public List<Categoria> listAllCategoria() {
        return categoriaRepository.findAll();
    }

    public void saveCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    public void deleteCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }








}
