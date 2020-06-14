package com.bi_as.biasApp.dto;

import com.bi_as.biasApp.domain.Atribute;
import com.bi_as.biasApp.domain.Graphic;

import javax.persistence.*;

public class AtributeDto {
    private Integer idAtribute;
    private String data;
    private int active;
    private int graphicidgraphic;

    public AtributeDto(Atribute atribute) {
        this.idAtribute=atribute.getIdAtribute();
        this.data=atribute.getData();
        this.active=atribute.getActive();
    }

    public AtributeDto(Integer idAtribute, String data, int active, int graphicidgraphic) {
        this.idAtribute = idAtribute;
        this.data = data;
        this.active = active;
        this.graphicidgraphic = graphicidgraphic;
    }

    public AtributeDto() {
    }

    public Integer getIdAtribute() {
        return idAtribute;
    }

    public void setIdAtribute(Integer idAtribute) {
        this.idAtribute = idAtribute;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getGraphicidgraphic() {
        return graphicidgraphic;
    }

    public void setGraphicidgraphic(int graphicidgraphic) {
        this.graphicidgraphic = graphicidgraphic;
    }

    @Override
    public String toString() {
        return "AtributeDto{" +
                "idAtribute=" + idAtribute +
                ", data='" + data + '\'' +
                ", active=" + active +
                '}';
    }
}
