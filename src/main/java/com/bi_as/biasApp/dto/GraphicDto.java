package com.bi_as.biasApp.dto;

import com.bi_as.biasApp.domain.Graphic;

public class GraphicDto {

    private Integer idGraphic;
    private String name;
    private String txUser;
    private String txHost;
    private String txDate;
    private int active;

    public GraphicDto(Graphic graphic) {
        this.idGraphic=graphic.getIdGraphic();
        this.name=graphic.getName();
        this.txUser=graphic.getTxHost();
        this.txHost=graphic.getTxHost();
        this.txDate=graphic.getTxDate();
        this.active=graphic.getActive();
    }


    public GraphicDto(Integer idGraphic, String name, String txUser, String txHost, String txDate, int active) {
        this.idGraphic = idGraphic;
        this.name = name;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
        this.active = active;
    }

    public Integer getIdGraphic() {
        return idGraphic;
    }

    public void setIdGraphic(Integer idGraphic) {
        this.idGraphic = idGraphic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "GraphicDto{" +
                "idGraphic=" + idGraphic +
                ", name='" + name + '\'' +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate='" + txDate + '\'' +
                ", active=" + active +
                '}';
    }
}
