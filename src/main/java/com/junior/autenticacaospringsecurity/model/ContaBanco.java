package com.junior.autenticacaospringsecurity.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class ContaBanco {

    @Id
    private String numeroConta;

    @OneToOne
    private Usuario usuario;
    
}
