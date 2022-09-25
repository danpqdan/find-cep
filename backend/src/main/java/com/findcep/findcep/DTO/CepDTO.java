package com.findcep.findcep.DTO;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CepDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    String cep;
    String logradouro;
    String complemento;
    String bairro;
    String uf;

}
