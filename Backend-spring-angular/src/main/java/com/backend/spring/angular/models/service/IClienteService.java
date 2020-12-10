package com.backend.spring.angular.models.service;

import java.util.List;

import com.backend.spring.angular.model.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save (Cliente cliente);
	
	public void delete (Long id);
	
}
