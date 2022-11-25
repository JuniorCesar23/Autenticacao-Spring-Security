package com.junior.autenticacaospringsecurity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Usuario {
    
    @Id
    private String cpf;
    private String nome;
    private Integer idade;
    private String numeroContato;
    private String email;

    public Usuario(){}

}
