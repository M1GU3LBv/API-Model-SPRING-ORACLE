package com.upeu.TestExam.service;

import com.upeu.TestExam.model.Cliente;
import com.upeu.TestExam.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> listAllCliente() {
        return clienteRepository.findAll();
    }


    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }
   public void deleteCliente(Long id) {
       clienteRepository.deleteById(id);
   }
   public Cliente get(Long id) {
       return clienteRepository.findById(id).get();

   }


}
