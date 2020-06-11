package com.bi_as.biasApp.controller;

import com.bi_as.biasApp.dto.ViewDto;
import com.bi_as.biasApp.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/k1/vista")
public class ViewController {

    private ViewService viewService;

    @Autowired
    public ViewController(ViewService viewService) {
        this.viewService = viewService;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
    List<ViewDto> all(){
        List<ViewDto> viewDtoList=new ArrayList<>();
        for(ViewDto viewDto:viewService.findAllViews()){
            viewDtoList.add(viewDto);
        }
        return viewDtoList;
    }


}
