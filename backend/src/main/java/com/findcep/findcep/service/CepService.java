package com.findcep.findcep.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.findcep.findcep.DTO.CepDTO;

@Service
public class CepService {

    public CepDTO consultaCep(String cep) {
        return new RestTemplate().getForEntity("https://viacep.com.br/ws/" + cep + "/json/", CepDTO.class).getBody();
    }

}
