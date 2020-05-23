package com.bi_as.biasApp.dto;

public class GraphictypeDto {
    private Integer idGraphictype;
    private String name;
    private int active;

    public GraphictypeDto() {
    }

    public GraphictypeDto(Integer idGraphictype, String name, int active) {
        this.idGraphictype = idGraphictype;
        this.name = name;
        this.active = active;
    }

    public Integer getIdGraphictype() {
        return idGraphictype;
    }

    public void setIdGraphictype(Integer idGraphictype) {
        this.idGraphictype = idGraphictype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Graphictype{" +
                "idGraphictype=" + idGraphictype +
                ", name='" + name + '\'' +
                ", active=" + active +
                '}';
    }
}