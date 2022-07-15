package com.confiancasistemas.portalxml.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.confiancasistemas.portalxml.entities.*;
import com.confiancasistemas.portalxml.repositories.EmpresaWebRepository;

@Service
public class EmpresaWebService {
	@Autowired
	private EmpresaWebRepository repository;
	
	public List<EmpresaWeb> findEmpresaWeb(){
		return repository.findAll();
	}
	
}
