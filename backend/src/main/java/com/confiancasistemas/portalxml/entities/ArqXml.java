package com.confiancasistemas.portalxml.entities;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author Cliente
 */
@Entity
@Table(name = "arq_xml")
public class ArqXml implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "data_emissao")
    private LocalDate dataEmissao;
    
    @Column(name = "tipo")
    private Integer tipo;
    
    
    
    @JoinColumn(name = "empresa", referencedColumnName = "id_emp")
    @ManyToOne(optional = true)
    private EmpresaWeb empresa;
    
    
    @Column(name = "chave")
    private String chave;
    
    @Column(name = "numero")
    private Integer numero;
    
    @Column(name = "serie")
    private String serie;
    
    @Lob
    @Column(name = "arq")
    private byte[] arq;
    
    @Column(name = "status")
    private String status;
    
    public ArqXml() {
    	
    }
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public EmpresaWeb getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaWeb empresa) {
		this.empresa = empresa;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public byte[] getArq() {
		return arq;
	}

	public void setArq(byte[] arq) {
		this.arq = arq;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArqXml)) {
            return false;
        }
        ArqXml other = (ArqXml) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.confiancasistemas.bd.api.model.ArqXml[ id=" + id + " ]";
    }
    
}
