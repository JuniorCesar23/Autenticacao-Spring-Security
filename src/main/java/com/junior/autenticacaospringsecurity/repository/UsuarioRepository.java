package com.junior.autenticacaospringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junior.autenticacaospringsecurity.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    boolean existsByCpf(String cpf);
    
}
