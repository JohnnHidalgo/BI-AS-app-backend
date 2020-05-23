package com.bi_as.biasApp.dto;

public class DashboardDto {
    private Integer idDashboard;
    private String name;
    private String txUser;
    private String txHost;
    private String txDate;
    private int active;

    public DashboardDto() {
    }

    public DashboardDto(Integer idDashboard, String name, String txUser, String txHost, String txDate, int active) {
        this.idDashboard = idDashboard;
        this.name = name;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
        this.active = active;
    }

    public Integer getIdDashboard() {
        return idDashboard;
    }

    public void setIdDashboard(Integer idDashboard) {
        this.idDashboard = idDashboard;
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
        return "DashboardDto{" +
                "idDashboard=" + idDashboard +
                ", name='" + name + '\'' +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate='" + txDate + '\'' +
                ", active=" + active +
                '}';
    }
}
