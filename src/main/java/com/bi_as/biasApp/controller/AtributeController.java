package com.bi_as.biasApp.controller;


import com.bi_as.biasApp.domain.Atribute;
import com.bi_as.biasApp.dto.AtributeDto;
import com.bi_as.biasApp.service.AtributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/k1/atribute")
public class AtributeController {

    private AtributeService atributeService;

    @Autowired
    public AtributeController(AtributeService atributeService) {
        this.atributeService = atributeService;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<AtributeDto> all(){
        List<AtributeDto> atributeDtoList=new ArrayList<>();
        for (AtributeDto atributeDto:atributeService.findAllAtribute()) {
            atributeDtoList.add(atributeDto);
        }
    return atributeDtoList;
    }
}
