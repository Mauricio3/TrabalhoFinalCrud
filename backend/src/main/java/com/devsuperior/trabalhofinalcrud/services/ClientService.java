package com.devsuperior.trabalhofinalcrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.trabalhofinalcrud.entities.Client;
import com.devsuperior.trabalhofinalcrud.repositories.ClientRepository;

public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<Client> findAll() {
		return repository.findAll();
	}
}
