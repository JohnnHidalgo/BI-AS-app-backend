package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.GraphicRepository;
import com.bi_as.biasApp.domain.Graphic;
import com.bi_as.biasApp.dto.GraphicDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GraphicService {

    GraphicRepository graphicRepository;

    @Autowired
    public GraphicService(GraphicRepository graphicRepository) {
        this.graphicRepository = graphicRepository;
    }

    public List<GraphicDto> findAllGraphic(){
        List<GraphicDto> GraphicDtoList= new ArrayList<>();
        for (Graphic graphic:graphicRepository.findAll()) {
            GraphicDtoList.add(new GraphicDto(graphic));
        }
        return GraphicDtoList;
    }

    public Graphic addView(Graphic graphic) {
        graphicRepository.save(graphic);
        return graphic;
    }
}
