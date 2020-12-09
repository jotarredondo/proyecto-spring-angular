package com.backend.spring.angular.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.spring.angular.model.entity.Cliente;
import com.backend.spring.angular.models.dao.ClienteDao;

@Service
public class ClienteServiceImp implements IClienteService {

	
	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		
		return (List<Cliente>)clienteDao.findAll();
	}

}