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
        return repository.findByDescontoNull();
    }

    public List<Venda> b(){
        return repository.findByDescontoGreaterThan(0);
    };

    
    public List<Venda> c(){
        return repository.findByOrderByValorUnitario();
    };

    public List<Venda> d(){
        return repository.findTopByOrderByQuantidadeDesc();
    };

    public List<Venda> d2() {
        List<Venda> d = repository.findByOrderByQuantidadeDesc();
        return repository.findByQuantidade(d.get(0).getQuantidade());
    }

    public List<Venda> e(){
        return repository.findByQuantidadeGreaterThanEqual(10);
    };

    public List<Integer> f(){
        return repository.findByNotaFiscalAcimaDe500();
    };
}
