package com.backend.spring.angular.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.backend.spring.angular.model.entity.Cliente;

@Repository
public interface ClienteDao extends CrudRepository<Cliente, Long> {

}
