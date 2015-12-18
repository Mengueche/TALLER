package erick.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;

import erick.hiberante.dao.ClienteDAO;
import erick.hibernate.persona.Taller;


public class ClienteController {

	@Autowired
	private ClienteDAO clienteDAO;
	
	public void ingresar(Taller taller){
		clienteDAO.Ingresar(taller);
	}

}
