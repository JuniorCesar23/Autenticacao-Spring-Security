package com.junior.autenticacaospringsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junior.autenticacaospringsecurity.model.Usuario;
import com.junior.autenticacaospringsecurity.repository.UsuarioRepository;
import com.junior.autenticacaospringsecurity.service.exceptions.ExistsCpfException;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // SALVAR USUÁRIO
    public Usuario salvarUsuario(Usuario usuario) {
        if (usuarioRepository.existsByCpf(usuario.getCpf())) {
            throw new ExistsCpfException(usuario);
        }
        return usuarioRepository.save(usuario);
    }

    // LISTAR USUÁRIOS JÁ SALVOS
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

}
