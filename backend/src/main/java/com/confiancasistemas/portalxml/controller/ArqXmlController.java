package com.confiancasistemas.portalxml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.confiancasistemas.portalxml.entities.ArqXml;
import java.util.List;
import com.confiancasistemas.portalxml.services.ArqXmlService;

@RestController
@RequestMapping(value="/arqxml")
public class ArqXmlController {
	
	@Autowired
	private ArqXmlService service;
	
	@GetMapping
	public Page<ArqXml> findArqXml(
			@RequestParam(value="minDate", defaultValue = "")String minDate,
			@RequestParam(value="maxDate", defaultValue = "")String maxDate,
			@RequestParam(value="empr", defaultValue="")String empr,
			Pageable pageable
	){
		return service.findXml(minDate, maxDate, empr, pageable);
	}
	
	/*
	@GetMapping
	public List<ArqXml> findArqXml(){
		return service.findArqXml();
	}*/
	/*@GetMapping
	public ModelAndView findArqXml(){
		Iterable<A>
		
		return service.findArqXml();
	}*/
	
	
	

}
