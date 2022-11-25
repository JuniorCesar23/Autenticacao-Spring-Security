package com.junior.autenticacaospringsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junior.autenticacaospringsecurity.model.ContaBanco;
import com.junior.autenticacaospringsecurity.repository.BancoRepository;
import com.junior.autenticacaospringsecurity.service.exceptions.ExistsCpfException;

@Service
public class BancoService {

    @Autowired
    private BancoRepository bancoRepository;

    // SALVAR CONTA DE BANCO
    public ContaBanco salvarContaBanco(ContaBanco contaBanco) {
        /* if (bancoRepository.existsByUsuario(contaBanco.getUsuario())) {
            throw new ExistsCpfException(contaBanco.getUsuario());
        } */
        return bancoRepository.save(contaBanco);
    }

    // LISTAR CONTAS DE BANCO SALVAS
    public List<ContaBanco> listarContasBancos() {
        return bancoRepository.findAll();
    }

}
