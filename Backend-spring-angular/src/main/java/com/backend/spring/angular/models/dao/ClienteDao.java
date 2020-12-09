package com.backend.spring.angular.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.backend.spring.angular.model.entity.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long> {

}
