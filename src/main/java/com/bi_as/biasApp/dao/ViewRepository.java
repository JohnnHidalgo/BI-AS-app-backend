package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.View;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewRepository extends JpaRepository<View,Integer> {
    List<View> findByName(String viewName);
    View findByIdView(int idView);
}
