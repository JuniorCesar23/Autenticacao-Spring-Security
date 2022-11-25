package com.junior.autenticacaospringsecurity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ContaBanco {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String numeroConta;

    @OneToOne
    private Usuario usuario;

    public ContaBanco(){}

    public ContaBanco(Usuario usuario){
        this.usuario = usuario;
    }
    
}
