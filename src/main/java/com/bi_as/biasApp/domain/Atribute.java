/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bi_as.biasApp.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "atribute")
@NamedQueries({
    @NamedQuery(name = "Atribute.findAll", query = "SELECT a FROM Atribute a"),
    @NamedQuery(name = "Atribute.findByIdAtribute", query = "SELECT a FROM Atribute a WHERE a.idAtribute = :idAtribute"),
    @NamedQuery(name = "Atribute.findByData", query = "SELECT a FROM Atribute a WHERE a.data = :data"),
    @NamedQuery(name = "Atribute.findByActive", query = "SELECT a FROM Atribute a WHERE a.active = :active")})
public class Atribute implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_atribute")
    private Integer idAtribute;
    @Basic(optional = false)
    @Column(name = "data")
    private String data;
    @Basic(optional = false)
    @Column(name = "active")
    private int active;
    @JoinColumn(name = "Graphic_id_graphic", referencedColumnName = "id_graphic")
    @ManyToOne(optional = false)
    private Graphic graphicidgraphic;

    public Atribute() {
    }

    public Atribute(Integer idAtribute) {
        this.idAtribute = idAtribute;
    }

    public Atribute(Integer idAtribute, String data, int active) {
        this.idAtribute = idAtribute;
        this.data = data;
        this.active = active;
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

    public Graphic getGraphicidgraphic() {
        return graphicidgraphic;
    }

    public void setGraphicidgraphic(Graphic graphicidgraphic) {
        this.graphicidgraphic = graphicidgraphic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAtribute != null ? idAtribute.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atribute)) {
            return false;
        }
        Atribute other = (Atribute) object;
        if ((this.idAtribute == null && other.idAtribute != null) || (this.idAtribute != null && !this.idAtribute.equals(other.idAtribute))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasgenerateentities.Atribute[ idAtribute=" + idAtribute + " ]";
    }
    
}
