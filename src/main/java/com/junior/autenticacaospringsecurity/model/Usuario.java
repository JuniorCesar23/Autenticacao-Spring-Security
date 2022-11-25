package com.junior.autenticacaospringsecurity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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

    @OneToOne(cascade = CascadeType.ALL)
    private ContaBanco contaBanco;

    public Usuario(){}

}
