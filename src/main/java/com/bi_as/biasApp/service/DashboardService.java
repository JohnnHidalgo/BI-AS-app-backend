package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.DashboardRepository;
import com.bi_as.biasApp.domain.Dashboard;
import com.bi_as.biasApp.dto.DashboardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DashboardService {
    DashboardRepository dashboardRepository;

    @Autowired
    public DashboardService(DashboardRepository dashboardRepository) {
        this.dashboardRepository = dashboardRepository;
    }

    public List<DashboardDto> findAllDashboard(){
        List<DashboardDto> dashboardDtoList=new ArrayList<>();
        for(Dashboard dashboard:dashboardRepository.findAll()){
            dashboardDtoList.add(new DashboardDto(dashboard));
        }
        return dashboardDtoList;
    }
}
