package com.salesianostriana.dam.ejercicioramas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	private Animador animador;
	
	@PostConstruct
	public void init() {
		
		animador.imprimirMensajeDeAnimo();
	}
	
}
