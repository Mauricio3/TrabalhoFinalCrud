package com.devsuperior.trabalhofinalcrud.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.trabalhofinalcrud.dto.ClientDTO;
import com.devsuperior.trabalhofinalcrud.entities.Client;
import com.devsuperior.trabalhofinalcrud.repositories.ClientRepository;

public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> list = repository.findAll();
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}
}
