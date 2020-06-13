package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.AtributeRepository;
import com.bi_as.biasApp.domain.Atribute;
import com.bi_as.biasApp.dto.AtributeDto;
import com.sun.org.apache.xml.internal.security.keys.content.keyvalues.RSAKeyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AtributeService {

    AtributeRepository atributeRepository;

    @Autowired
    public AtributeService(AtributeRepository atributeRepository) {
        this.atributeRepository = atributeRepository;
    }

    public List<AtributeDto> findAllAtribute(){
        List<AtributeDto> atributeDtoList=new ArrayList<>();

        for (Atribute atribute:atributeRepository.findAll()) {
            atributeDtoList.add(new AtributeDto(atribute));
        }
        return atributeDtoList;
    }

    public Atribute addView(Atribute atribute) {
        atributeRepository.save(atribute);
        return atribute;
    }
}
