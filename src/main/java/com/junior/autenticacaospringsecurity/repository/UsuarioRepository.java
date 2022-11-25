package com.junior.autenticacaospringsecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junior.autenticacaospringsecurity.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    boolean existsByCpf(String cpf);

    Optional<Usuario> findByNome(String nome);
    
}
