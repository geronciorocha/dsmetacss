/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.confiancasistemas.portalxml.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Cliente
 */
@Entity
@Table(name = "empresa")
public class EmpresaWeb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_emp")
    private Integer idEmp;
    @Column(name = "nome_emp")
    private String nomeEmp;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "obs")
    private String obs;
    @Column(name = "ip_scef")
    private String ipScef;
    @Column(name = "mac_scef")
    private String macScef;
    @Column(name = "con_scef")
    private String conScef;
    @Column(name = "ip_nfce")
    private String ipNfce;
    @Column(name = "mac_nfce")
    private String macNfce;
    @Column(name = "con_nfce")
    private String conNfce;
    @Column(name = "ip_nfe")
    private String ipNfe;
    @Column(name = "mac_nfe")
    private String macNfe;
    @Column(name = "con_nfe")
    private String conNfe;
    @Column(name = "ip_mobile")
    private String ipMobile;
    @Column(name = "ip_coletor")
    private String ipColetor;
    @Column(name = "v_estoque")
    private String vEstoque;
    @Column(name = "v_nfce")
    private String vNfce;
    @Column(name = "v_nfe")
    private String vNfe;
    @Column(name = "v_sisseg")
    private String vSisseg;
    @Column(name = "v_checkout")
    private String vCheckout;
    @Basic(optional = false)
    @Column(name = "status")
    private int status;
    
    /*@OneToMany(mappedBy = "empresa")
    private java.util.List<ArqXml> arqXml = new ArrayList<>();*/

    public EmpresaWeb() {
    }

    public EmpresaWeb(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public EmpresaWeb(Integer idEmp, int status) {
        this.idEmp = idEmp;
        this.status = status;
    }

    public Integer getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public String getNomeEmp() {
        return nomeEmp;
    }

    public void setNomeEmp(String nomeEmp) {
        this.nomeEmp = nomeEmp;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getIpScef() {
        return ipScef;
    }

    public void setIpScef(String ipScef) {
        this.ipScef = ipScef;
    }

    public String getMacScef() {
        return macScef;
    }

    public void setMacScef(String macScef) {
        this.macScef = macScef;
    }

    public String getConScef() {
        return conScef;
    }

    public void setConScef(String conScef) {
        this.conScef = conScef;
    }

    public String getIpNfce() {
        return ipNfce;
    }

    public void setIpNfce(String ipNfce) {
        this.ipNfce = ipNfce;
    }

    public String getMacNfce() {
        return macNfce;
    }

    public void setMacNfce(String macNfce) {
        this.macNfce = macNfce;
    }

    public String getConNfce() {
        return conNfce;
    }

    public void setConNfce(String conNfce) {
        this.conNfce = conNfce;
    }

    public String getIpNfe() {
        return ipNfe;
    }

    public void setIpNfe(String ipNfe) {
        this.ipNfe = ipNfe;
    }

    public String getMacNfe() {
        return macNfe;
    }

    public void setMacNfe(String macNfe) {
        this.macNfe = macNfe;
    }

    public String getConNfe() {
        return conNfe;
    }

    public void setConNfe(String conNfe) {
        this.conNfe = conNfe;
    }

    public String getIpMobile() {
        return ipMobile;
    }

    public void setIpMobile(String ipMobile) {
        this.ipMobile = ipMobile;
    }

    public String getIpColetor() {
        return ipColetor;
    }

    public void setIpColetor(String ipColetor) {
        this.ipColetor = ipColetor;
    }

    public String getVEstoque() {
        return vEstoque;
    }

    public void setVEstoque(String vEstoque) {
        this.vEstoque = vEstoque;
    }

    public String getVNfce() {
        return vNfce;
    }

    public void setVNfce(String vNfce) {
        this.vNfce = vNfce;
    }

    public String getVNfe() {
        return vNfe;
    }

    public void setVNfe(String vNfe) {
        this.vNfe = vNfe;
    }

    public String getVSisseg() {
        return vSisseg;
    }

    public void setVSisseg(String vSisseg) {
        this.vSisseg = vSisseg;
    }

    public String getVCheckout() {
        return vCheckout;
    }

    public void setVCheckout(String vCheckout) {
        this.vCheckout = vCheckout;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
/*
    public List	<ArqXml> getArqXml() {
		return arqXml;
	}

    public void setArqXml(List<ArqXml> arqXml) {
		this.arqXml = arqXml;
	}*/

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmp != null ? idEmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresaWeb)) {
            return false;
        }
        EmpresaWeb other = (EmpresaWeb) object;
        if ((this.idEmp == null && other.idEmp != null) || (this.idEmp != null && !this.idEmp.equals(other.idEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.confiancasistemas.bd.api.model.EmpresaWeb[ idEmp=" + idEmp + " ]";
    }

	
    
}
