package com.findcep.findcep.controller;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.findcep.findcep.DTO.CepDTO;
import com.findcep.findcep.model.CepModel;
import com.findcep.findcep.service.CepService;

@RestController
public class CepController {

    @Autowired
    private CepService cepService;

    @ResponseBody
    @GetMapping(value = "/consultaCep/{cep}")
    public ResponseEntity<CepDTO> consultaCep(@PathVariable("cep") String cep) {
        CepDTO cepDTO = cepService.consultaCep(cep);
        return new ResponseEntity<CepDTO>(cepDTO, HttpStatus.OK);
    }

}
