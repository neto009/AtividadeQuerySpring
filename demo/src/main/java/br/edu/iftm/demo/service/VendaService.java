package br.edu.iftm.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iftm.demo.model.Venda;
import br.edu.iftm.demo.repository.VendaRepository;

@Service
public class VendaService {

    @Autowired
    VendaRepository repository;

    public List<Venda> a() {
        return repository.findByDesconto(0);
    }

    public List<Venda> b(){
        return repository.findByDesconto();
    };

    
    public List<Venda> c(){
        return repository.findByMaior();
    };
    
}
