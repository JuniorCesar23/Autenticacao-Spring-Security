package com.junior.autenticacaospringsecurity.service.exceptions;

import com.junior.autenticacaospringsecurity.model.Usuario;

public class ExistsCpfException extends RuntimeException {

    public ExistsCpfException(Usuario usuario){
        super("Esse CPF já está sendo usado: " + usuario.getCpf());
    }
    
}
