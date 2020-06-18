package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.AtributeGraphicRepository;
import com.bi_as.biasApp.domain.Atribute;
import com.bi_as.biasApp.domain.AtributeGraphic;
import com.bi_as.biasApp.domain.Graphic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AtributeGraphicService {

    GraphicService graphicService;
    AtributeService atributeService;
    AtributeGraphicRepository atributeGraphicRepository;

    @Autowired
    public AtributeGraphicService(GraphicService graphicService, AtributeService atributeService,AtributeGraphicRepository atributeGraphicRepository) {
        this.graphicService = graphicService;
        this.atributeService = atributeService;
        this.atributeGraphicRepository=atributeGraphicRepository;
    }

    public void saveAttributeService(int idGraphic, int idAtribute){
        Graphic graphic=graphicService.getGraphicByidGraphic(idGraphic);
        Atribute atribute=atributeService.getAtributeByIdAtribute(idAtribute);
        AtributeGraphic atributeGraphic=new AtributeGraphic();
        atributeGraphic.setIdGraphic(graphic);
        atributeGraphic.setIdAtribute(atribute);
        atributeGraphicRepository.save(atributeGraphic);
    }


    public List<Atribute> getAtributeListByIdGraphic(int idGraphic) {
        Graphic graphic=graphicService.getGraphicByidGraphic(idGraphic);
        List<AtributeGraphic> atributeGraphicList=graphic.getAtributeGraphicList();
        List<Atribute> atributeList=new ArrayList<>();
        for(AtributeGraphic atributeGraphic:atributeGraphicList){
            atributeList.add(atributeGraphic.getIdAtribute());
        }
        return atributeList;
    }

}
