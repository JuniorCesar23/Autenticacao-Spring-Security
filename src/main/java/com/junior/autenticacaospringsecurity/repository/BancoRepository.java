package com.junior.autenticacaospringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junior.autenticacaospringsecurity.model.ContaBanco;

@Repository
public interface BancoRepository extends JpaRepository<ContaBanco, String> {

}
