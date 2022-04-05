package br.edu.iftm.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import br.edu.iftm.demo.model.Venda;

public interface VendaRepository extends CrudRepository<Venda, Integer> {
    
     
    // Retorna todos os itens que foram vendidos sem desconto. 
    public List<Venda> findByDesconto(Integer desconto);

    // Retorna todos os itens que foram vendidos com desconto. 
    // Retorna todos os itens e ordene o resultado do maior valor para o menor. 
    // Retorna o produto que mais vendeu.  
    // Consulte as NF que foram vendidas mais de 10 unidades de pelo menos um produto. 
    // Pesquise o valor total das NF, onde esse valor seja maior que 500, e ordene o resultado do maior valor para o menor.

}
