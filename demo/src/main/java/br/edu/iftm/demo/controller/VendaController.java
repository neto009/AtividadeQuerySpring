package br.edu.iftm.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    ResponseEntity<List<Venda>> exa(){
        return ResponseEntity.status(HttpStatus.OK).body(service.a());
    }

    @GetMapping("b")
    List<Venda> exb(){
        return service.b();
    }

    @GetMapping("c")
    ResponseEntity<List<Venda>> exc(){
        return ResponseEntity.status(HttpStatus.OK).body(service.c());
    }
}
