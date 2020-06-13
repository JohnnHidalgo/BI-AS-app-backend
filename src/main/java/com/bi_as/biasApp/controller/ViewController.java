package com.bi_as.biasApp.controller;

import com.bi_as.biasApp.domain.User;
import com.bi_as.biasApp.domain.View;
import com.bi_as.biasApp.dto.ViewDto;
import com.bi_as.biasApp.service.UserService;
import com.bi_as.biasApp.service.ViewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/k1/view")
public class ViewController {
    private static final Logger LOGGER= LoggerFactory.getLogger(ViewController.class);

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

    @PostMapping("/add/")
    public View addView(@RequestBody View view){
        LOGGER.info("Agregando usuario");
        return viewService.addView(view);
    }

    @PostMapping("/add/")
    public View getIdViewByView(@RequestBody View view){
        LOGGER.info("Agregando usuari   o");
        return viewService.addView(view);
    }










}
