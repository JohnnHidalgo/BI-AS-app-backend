package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Graphic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GraphicRepository extends JpaRepository<Graphic,Integer> {
    Graphic findByName(String graphicName);

    @Query(value = "select * from graphic where id_graphic=?1 LIMIT 1",nativeQuery = true)
    Graphic findByIdGraphic(int id_graphic);



}
