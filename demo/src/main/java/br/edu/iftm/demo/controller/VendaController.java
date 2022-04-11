package br.edu.iftm.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.demo.model.Venda;
import br.edu.iftm.demo.service.VendaService;

@RestController
@RequestMapping("venda")
public class VendaController {
    
    @Autowired
    VendaService service;

    @GetMapping("a")
    List<Venda> exa(){
        return service.a();
    }

    @GetMapping("b")
    List<Venda> exb(){
        return service.b();
    }

    @GetMapping("c")
    List<Venda> exc(){
        return service.c();
    }
}
