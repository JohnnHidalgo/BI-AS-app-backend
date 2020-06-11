package com.bi_as.biasApp.controller;

import com.bi_as.biasApp.domain.Dashboard;
import com.bi_as.biasApp.dto.DashboardDto;
import com.bi_as.biasApp.service.DashboardService;
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
@RequestMapping("/k1/dashboard")
public class DashboardController {


    private  DashboardService dashboardService;


    @Autowired
    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    List<DashboardDto> all(){
        List<DashboardDto> dashboardDtoList=new ArrayList<>();
        for(DashboardDto dashboardDto:dashboardService.findAllDashboard()){
            dashboardDtoList.add(dashboardDto);
        }
        return dashboardDtoList;
    }}
