package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Graphic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GraphicRepository extends JpaRepository<Graphic,Integer> {
    Graphic findByIdGraphic(String id_graphic);
    Graphic findByName(String graphicName);



}
