package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DashboardRepository extends JpaRepository<Dashboard,Integer> {
    Dashboard findByIdDashboard(int idDashboard);
    Dashboard findByName(String name);
    Dashboard findByActive(boolean isActive);
}
