package erick.hibernate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import erick.hibernate.controller.ClienteController;


@Configuration
public class ClienteConfig {

	@Bean
	public ClienteController clienteController(){
		ClienteController clienteController=new ClienteController();
		return clienteController;
	}

}
