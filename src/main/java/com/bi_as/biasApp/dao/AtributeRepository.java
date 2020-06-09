package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Atribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtributeRepository extends JpaRepository<Atribute,Integer> {

    Atribute findByIdAtribute(int idAtribute);
    Atribute findByActive(boolean isActive);

}
