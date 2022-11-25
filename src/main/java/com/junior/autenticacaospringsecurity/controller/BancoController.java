package com.junior.autenticacaospringsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junior.autenticacaospringsecurity.model.ContaBanco;
import com.junior.autenticacaospringsecurity.service.BancoService;

@RestController
@RequestMapping(value = "/contasbanco")
public class BancoController {

    @Autowired
    private BancoService bancoService;

    @GetMapping
    public ResponseEntity<List<ContaBanco>> listarContasBanco(){
        List<ContaBanco> contaBancos = bancoService.listarContasBancos();
        return ResponseEntity.ok().body(contaBancos);
    }

    @PostMapping
    public ResponseEntity<ContaBanco> salvarContaBanco(@RequestBody ContaBanco contaBanco){
        contaBanco = bancoService.salvarContaBanco(contaBanco);
        return ResponseEntity.ok().body(contaBanco);
    }
    
}
