package com.bi_as.biasApp.dto;

import com.bi_as.biasApp.domain.Atribute;

public class AtributeDto {
    private Integer idAttribute;
    private String data;
    private int active;
    private int graphicidgraphic;

    public AtributeDto(Atribute atribute) {
        this.idAttribute=atribute.getIdAtribute();
        this.data=atribute.getData();
        this.active=atribute.getActive();
    }

    public AtributeDto(Integer idAtribute, String data, int active, int graphicidgraphic) {
        this.idAttribute = idAtribute;
        this.data = data;
        this.active = active;
        this.graphicidgraphic = graphicidgraphic;
    }

    public AtributeDto() {
    }

    public Integer getIdAtribute() {
        return idAttribute;
    }

    public void setIdAtribute(Integer idAtribute) {
        this.idAttribute = idAtribute;
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
                "idAtribute=" + idAttribute +
                ", data='" + data + '\'' +
                ", active=" + active +
                '}';
    }
}
