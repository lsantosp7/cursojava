package com.ejercicio23.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.GestionCajero;

@Controller
public class ValidacionController {
	
	@Autowired
	GestionCajero gcajero;
	
	@RequestMapping("/doValidacion")
	public String login(@RequestParam("codigoCuenta") int codigoCuenta){
		gcajero.autenticarCuenta(codigoCuenta);
		return "operaciones";
	}
}
