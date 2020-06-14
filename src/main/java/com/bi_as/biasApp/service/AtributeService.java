package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.AtributeRepository;
import com.bi_as.biasApp.domain.Atribute;
import com.bi_as.biasApp.domain.Graphic;
import com.bi_as.biasApp.dto.AtributeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AtributeService {

    AtributeRepository atributeRepository;
    GraphicService graphicService;

    @Autowired
    public AtributeService(AtributeRepository atributeRepository,GraphicService graphicService) {
        this.atributeRepository = atributeRepository;
        this.graphicService=graphicService;
    }

    public List<AtributeDto> findAllAtribute(){
        List<AtributeDto> atributeDtoList=new ArrayList<>();

        for (Atribute atribute:atributeRepository.findAll()) {
            atributeDtoList.add(new AtributeDto(atribute));
        }
        return atributeDtoList;
    }

    public Atribute addAtribute(AtributeDto atributeDto) {
        Atribute atribute=new Atribute();
        Graphic graphic=graphicService.getGraphicByidGraphic(atributeDto.getGraphicidgraphic());
        atribute.setData(atributeDto.getData());
        atribute.setActive(atributeDto.getActive());
        atribute.setGraphicidgraphic(graphic);
        atributeRepository.save(atribute);
        return atribute;
    }

    public Atribute getAtributeByIdAtribute(int idAtribute){
        Atribute atribute=atributeRepository.findByIdAtribute(idAtribute);
        return atribute;
    }
}
