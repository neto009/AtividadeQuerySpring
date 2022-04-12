package br.edu.iftm.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import br.edu.iftm.demo.model.Venda;

public interface VendaRepository extends CrudRepository<Venda, Integer> {
    
     
    // Retorna todos os itens que foram vendidos sem desconto. 
    public List<Venda> findByDescontoNull();

    // Retorna todos os itens que foram vendidos com desconto. 
    public List<Venda> findByDescontoGreaterThan(Integer desconto);

    // Retorna todos os itens e ordene o resultado do maior valor para o menor. 
    public List<Venda> findByOrderByValorUnitario();

    // Retorna o produto que mais vendeu.  
    public List<Venda> findTopByOrderByQuantidadeDesc();
    public List<Venda> findByOrderByQuantidadeDesc();
    public List<Venda> findByQuantidade(Integer valor);

    // Consulte as NF que foram vendidas mais de 10 unidades de pelo menos um produto. 
    public List<Venda> findByQuantidadeGreaterThanEqual(Integer valor);

    // Pesquise o valor total das NF, onde esse valor seja maior que 500, e ordene o resultado do maior valor para o menor.
    @Query("select v.idNotaFiscal from Venda v group by idNotaFiscal having sum(quantidade*valorUnitario) > 500 order by sum(quantidade*valorUnitario)")
    public List<Integer> findByNotaFiscalAcimaDe500();
}
