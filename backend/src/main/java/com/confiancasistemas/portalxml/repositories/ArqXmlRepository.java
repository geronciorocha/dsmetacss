package com.confiancasistemas.portalxml.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.confiancasistemas.portalxml.entities.ArqXml;
import com.confiancasistemas.portalxml.entities.EmpresaWeb;

public interface ArqXmlRepository extends JpaRepository<ArqXml, Integer>{
	
	//List<ArqXml> findByEmpresa(EmpresaWeb empresa);
	
	@Query("SELECT a FROM ArqXml a WHERE a.empresa.idEmp = :empr and a.dataEmissao BETWEEN :min and :max ORDER BY a.dataEmissao asc")
	Page<ArqXml> findXml(LocalDate min, LocalDate max, Integer empr, Pageable pageable);
	
}
