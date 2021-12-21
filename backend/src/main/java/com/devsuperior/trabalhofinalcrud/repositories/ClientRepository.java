package com.devsuperior.trabalhofinalcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.trabalhofinalcrud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
