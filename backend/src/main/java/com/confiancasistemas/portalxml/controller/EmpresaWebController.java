package com.confiancasistemas.portalxml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.confiancasistemas.portalxml.entities.EmpresaWeb;
import com.confiancasistemas.portalxml.services.EmpresaWebService;

@RestController
@RequestMapping(value="/empresaweb")
public class EmpresaWebController {

		
		@Autowired
		private EmpresaWebService service;
		
		@GetMapping
		public List<EmpresaWeb> findEmpresaWeb(){
			return service.findEmpresaWeb();
		}

	
}
