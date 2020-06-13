package com.bi_as.biasApp.controller;


import com.bi_as.biasApp.domain.Atribute;
import com.bi_as.biasApp.domain.Dashboard;
import com.bi_as.biasApp.dto.AtributeDto;
import com.bi_as.biasApp.service.AtributeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/k1/atribute")
public class AtributeController {

    private AtributeService atributeService;
    private static final Logger LOGGER= LoggerFactory.getLogger(UserController.class);


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


    @PostMapping("/add/")
    public Atribute addView(@RequestBody Atribute atribute){
        LOGGER.info("Agregando usuario");
        return atributeService.addView(atribute);
    }


    @RequestMapping("/{id}")
    public AtributeDto getViewByidView(@PathVariable("id") Integer id){
        return new AtributeDto(atributeService.getAtributeByIdAtribute(id));
    }





}
