package br.edu.iftm.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.iftm.demo.model.Venda;
import br.edu.iftm.demo.repository.VendaRepository;

public class VendaService {

    @Autowired
    VendaRepository repository;

    public List<Venda> a() {
        return repository.findByDesconto(0);
    }
    
}
