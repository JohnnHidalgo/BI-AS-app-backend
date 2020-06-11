package com.bi_as.biasApp.controller;

import com.bi_as.biasApp.dto.GraphicDto;
import com.bi_as.biasApp.service.GraphicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/k1/graphic")
public class GraphicController {

    GraphicService graphicService;

    @Autowired
    public GraphicController(GraphicService graphicService) {
        this.graphicService = graphicService;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    List<GraphicDto> all(){
        List<GraphicDto> graphicDtoList=new ArrayList<>();
        for(GraphicDto graphicDto:graphicService.findAllGraphic()){
            graphicDtoList.add(graphicDto);
        }
        return graphicDtoList;
    }
}
