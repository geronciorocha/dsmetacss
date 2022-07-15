package com.confiancasistemas.portalxml.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.confiancasistemas.portalxml.entities.ArqXml;
import com.confiancasistemas.portalxml.repositories.ArqXmlRepository;

@Service
public class ArqXmlService {
	@Autowired
	private ArqXmlRepository repository;	
	
	public List<ArqXml> findArqXml(){
		return repository.findAll();
	}
	
	public Page<ArqXml> findXml(String minDate, String maxDate, String empr, Pageable pageable){
		
		LocalDate min=null, max=null;
		min = minDate.isEmpty() ? null : LocalDate.parse(minDate);
		max = maxDate.isEmpty() ? null : LocalDate.parse(maxDate);
		
		return repository.findXml(
				
				min==null?LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault()):min,
				max==null?LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault()):max, 
			    Integer.parseInt(empr),
			    pageable
				
		);
	}
	//public Page<ArqXml> findArqXml(Pageable pageable){
		//return repository.findByEmpresa(null);
	//}
	
}
